package com.k_int.iso10161

import spock.lang.Specification
import spock.lang.Unroll
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_APDU_codec
import com.k_int.iso10160.*;

class ProtocolTest extends Specification {

    @Unroll
    def "test"() {
        expect:
          1==1
    }

    def testRequestEncoding() {
      when:
        ISO10160ASE tcp_adapter = new ISO10160ASE()

        tcp_adapter.send('localhost',499,
          ISO10161DataBinder.toISO('REQUEST',
            [
              protocol_version_num:1,
              transaction_id:[
                // Transaction_Id_type
                initial_requester_id:[
                  transaction_group_qualifier:java.util.UUID.randomUUID().toString(),
                  transaction_qualifier:java.util.UUID.randomUUID().toString(),
                ]
              ],
              service_date_time: [
                date_time_of_this_service:[date:'20170101', time:'0000'],
                date_time_of_original_service:[date:'20180101',time:'1111'],
              ],
              transaction_type:BigInteger.valueOf(1),  // 1:Simple, 2:Chained, 3:Partitioned
              iLL_service_type:['loan','copy-non-returnable','locations','estimate','responder-specific'],
              requester_optional_messages:[
                can_send_RECEIVED:Boolean.TRUE,
                can_send_RETURNED:Boolean.TRUE,
                requester_SHIPPED:new BigInteger(0),
                requester_CHECKED_IN:new BigInteger(0)
              ],
              place_on_hold:0,
              item_id:[
                title:'A test title'
              ],
              retry_flag:false,
              forward_flag:false
            ]));

      then:
        println('updated');

      expect:
        1==1;
    }
}
