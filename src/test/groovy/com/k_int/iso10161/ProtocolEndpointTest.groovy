package com.k_int.iso10161

import spock.lang.Specification
import spock.lang.Unroll
import com.k_int.a2j.ProtocolEndpoint
import java.math.BigInteger
import com.k_int.a2j.ProtocolServer;
import com.k_int.a2j.ProtocolAssociation;
import com.k_int.a2j.ProtocolAssociationObserver;
import com.k_int.a2j.ProtocolAssociationFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_APDU_codec
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_APDU_type
import com.k_int.iso10160.ISO10161DataBinder
import com.k_int.iso10160.ISO10161ToJsonDataBinder

/**
 * Test the traditional socket based client and server endpoints.
 */
class ProtocolEndpointTest extends Specification {

  final static Logger logger = LoggerFactory.getLogger(ProtocolEndpointTest.class);

  @Unroll
  def testBasicIntProtocol() {

    List received_apdus = new java.util.ArrayList();

    setup:
      logger.debug("Create New protocol server");

  
      // Create a new protocol association observer that will collect all incoming APDUs (BigInts in this case)
      ProtocolAssociationObserver pao = new ProtocolAssociationObserver<ILL_APDU_type>() {
        public void notify(ProtocolAssociation pa, ILL_APDU_type apdu) {
          logger.debug("ProtocolAssociationObserver::notify - Incoming ${apdu.which} from ${pa}");
          synchronized(received_apdus) {
            received_apdus.add(apdu)
            received_apdus.notifyAll()
          }
        }
      }

      // Override the default protocol association with one that notifies our observer above
      ProtocolAssociationFactory paf = new ProtocolAssociationFactory<ILL_APDU_codec,ILL_APDU_type>() {
        public ProtocolAssociation create(Socket socket,
                                          ILL_APDU_codec root_codec,
                                          String association_name) {
          ProtocolAssociation result = null;
          result = new ProtocolAssociation<ILL_APDU_codec,ILL_APDU_type>(socket,root_codec,'ServerAssociation')
          result.setObserver(pao);
          return result;
        }
      }

      // Create a new protocol server listening on port 8999i for encoded integer values, 
      // and customise the protocol association factory
      // so that we pass our observer to all associations.
      ProtocolServer ps = new ProtocolServer<ILL_APDU_codec, ILL_APDU_type>(
               8999, 
               ILL_APDU_codec.getCodec(),
               paf);

      logger.debug("Start New protocol server");
      ps.start();
      logger.debug("Started Server. Size of received_apdus list is ${received_apdus.size()}");

    when:
      // Create a client capable of transmitting big integers and send the value 1002 to the server using
      // that client.
      logger.debug("Create client");
      java.net.Socket client_socket = new java.net.Socket(java.net.InetAddress.getByName('localhost'),8999);
      ProtocolAssociation client = new ProtocolAssociation<ILL_APDU_codec, ILL_APDU_type>(client_socket,ILL_APDU_codec.getCodec(),'ClientAssociation');

      // Start client thread
      client.start()

      Map source_request = [request:
            [
              protocol_version_num:1,
              transaction_id:[
                // Transaction_Id_type
                transaction_group_qualifier:java.util.UUID.randomUUID().toString(),
                transaction_qualifier:java.util.UUID.randomUUID().toString(),
              ],
              service_date_time: [
                date_time_of_this_service:[date:'20170101', time:'0000'],
                date_time_of_original_service:[date:'20180101',time:'1111'],
              ],
              requester_id:[
                person_or_institution_symbol:[
                  institution_symbol:'ILLTEST-local-001'
                ]
              ],
              responder_id:[
                person_or_institution_symbol:[
                  institution_symbol:'ILLTEST-local-002'
                ]
              ],
              transaction_type:'simple',  // Understands 1,2,3 or "simple", "chained", "partitioned". 1:Simple, 2:Chained, 3:Partitioned
              iLL_service_type:['loan','copy-non-returnable','locations','estimate','responder-specific'],
              requester_optional_messages:[
                can_send_RECEIVED:true,
                can_send_RETURNED:true,
                requester_SHIPPED:new BigInteger(2),  // 1=Requires,2=Desires,3=Neither
                requester_CHECKED_IN:new BigInteger(2)  // 1=Requires,2=Desires,3=Neither
              ],
              place_on_hold: new BigInteger(3),  // 1=Yes,2=No,3=According to policy
              item_id:[
                title:'A test title'
              ],
              retry_flag:false,
              forward_flag:false,
              requester_note:'ILLTEST-CASE-001'
            ]];

      logger.debug("Send int value 1002");
      client.send(ISO10161DataBinder.toISO(source_request));

      // All done, close client
      logger.debug("Close client");
      client.close();

    then:
      int num_apdus = 1;
      // Wait to see if the value arrives on the server
      synchronized(received_apdus) {
        logger.debug("Waiting for received_apdus to be ${num_apdus}: ${received_apdus.size()}");
        while ( received_apdus.size() != num_apdus ) {
          logger.debug("Waiting on changes to received_apdus");
          received_apdus.wait(10000);
        }
      }
      logger.debug("There are ${received_apdus.size()} APDUs waiting..");
      assert num_apdus == received_apdus.size()

      Map received_request = ISO10161ToJsonDataBinder.toJson(received_apdus.get(0));
      logger.debug("Received message as JSON: ${received_request}");


    expect:
      // We got as many incoming fields as we sent, and that the titles match - We really should 
      // Do a deep comparison here
      received_request.size() == source_request.size();
      received_request.request.transaction_type.equals('simple');
      received_request.request.item_id.title.equals(source_request.request.item_id.title);
      received_request.request.requester_id?.person_or_institution_symbol.institution_symbol.equals('ILLTEST-local-001');
      received_request.request.responder_id?.person_or_institution_symbol.institution_symbol.equals('ILLTEST-local-002');
      received_request.request.requester_note.equals('ILLTEST-CASE-001');

    cleanup:
      logger.debug("Shutdown protocol server (And wait for it to complete)");
      ps.stop(true);
  }
}
