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
        tcp_adapter.send(
          ISO10161DataBinder.toISO(
            [
              '__choiceHint':'com.k_int.iso10161.ISO_10161_ILL_1.ILL_Request_type',
              protocol_version_num:1,
              transaction_id:[
                // Transaction_Id_type
                initial_requester_id:[
                  // System_Id_type
                  transaction_group_qualifier:[
                    // ILL_String_type
                  ],
                  transaction_qualifier:[
                    // ILL_String_type
                  ]
                ]
              ],
              service_date_time:[
                // Service_Date_Time_type
              ],
              requester_id:[
                // System_Id_type
              ],
              responder_id:[
                // System_Id_type
              ],
              transaction_type:1,
              iLL_service_type:1,
              requester_optional_messages:[
                // Requester_Optional_Messages_Type_type
              ],
              place_on_hold:0,
              item_id:[
                // Item_Id_type
              ],
              retry_flag:false,
              forward_flag:false
            ]));

      then:
        expect 1==1
    }
}
