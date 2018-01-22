package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class ILL_Request_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ILL_Request_codec.class);
  public static ILL_Request_codec me = null;

  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Place_On_Hold_Type_codec i_place_on_hold_type_codec = Place_On_Hold_Type_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private Delivery_Address_codec i_delivery_address_codec = Delivery_Address_codec.getCodec();
  private iLL_service_type_inline0_codec i_ill_service_type_inline0_codec = iLL_service_type_inline0_codec.getCodec();
  private Third_Party_Info_Type_codec i_third_party_info_type_codec = Third_Party_Info_Type_codec.getCodec();
  private iLL_request_extensions_inline2_codec i_ill_request_extensions_inline2_codec = iLL_request_extensions_inline2_codec.getCodec();
  private Client_Id_codec i_client_id_codec = Client_Id_codec.getCodec();
  private Supplemental_Item_Description_codec i_supplemental_item_description_codec = Supplemental_Item_Description_codec.getCodec();
  private Cost_Info_Type_codec i_cost_info_type_codec = Cost_Info_Type_codec.getCodec();
  private Requester_Optional_Messages_Type_codec i_requester_optional_messages_type_codec = Requester_Optional_Messages_Type_codec.getCodec();
  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();
  private Transaction_Type_codec i_transaction_type_codec = Transaction_Type_codec.getCodec();
  private supply_medium_info_type_inline1_codec i_supply_medium_info_type_inline1_codec = supply_medium_info_type_inline1_codec.getCodec();
  private Item_Id_codec i_item_id_codec = Item_Id_codec.getCodec();
  private Search_Type_codec i_search_type_codec = Search_Type_codec.getCodec();
  private Delivery_Service_codec i_delivery_service_codec = Delivery_Service_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private EXTERNAL_codec i_external_codec = EXTERNAL_codec.getCodec();

  public synchronized static ILL_Request_codec getCodec()
  {
    if ( me == null )
    {
      me = new ILL_Request_codec();
    }
    return me;
  }

/** Convert this java type to or from a string of octets using the supplied 
 *  serialisation manager
 *  @author A2J Auto Generated Java Class
 *  @param sm The Serialisation Manager 
 *  @param type_instance If we are encoding, the type to encode.
 *  @param is_optional Flag indicating if this type is optional
 *  @param type_name The type name for diagnostic information
 *  @return A decoded java type or the type that was passed in for encoding
 */  
  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    ILL_Request_type retval = (ILL_Request_type)type_instance;

    if ( sm.constructedBegin(64, 1) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new ILL_Request_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.transaction_type = (java.math.BigInteger)sm.implicit_tag(i_transaction_type_codec, retval.transaction_type, 128, 5, false, "transaction_type");
      retval.delivery_address = (Delivery_Address_type)sm.implicit_tag(i_delivery_address_codec, retval.delivery_address, 128, 6, true, "delivery_address");
      retval.delivery_service = (Delivery_Service_type)i_delivery_service_codec.serialize(sm, retval.delivery_service,true, "delivery_service");
      retval.billing_address = (Delivery_Address_type)sm.implicit_tag(i_delivery_address_codec, retval.billing_address, 128, 8, true, "billing_address");
      retval.iLL_service_type = (java.util.Vector)sm.implicit_tag(i_ill_service_type_inline0_codec, retval.iLL_service_type, 128, 9, false, "iLL_service_type");
      retval.responder_specific_service = (EXTERNAL_type)sm.explicit_tag(i_external_codec, retval.responder_specific_service, 128, 10, true, "responder_specific_service");
      retval.requester_optional_messages = (Requester_Optional_Messages_Type_type)sm.implicit_tag(i_requester_optional_messages_type_codec, retval.requester_optional_messages, 128, 11, false, "requester_optional_messages");
      retval.search_type = (Search_Type_type)sm.implicit_tag(i_search_type_codec, retval.search_type, 128, 12, true, "search_type");
      retval.supply_medium_info_type = (java.util.Vector)sm.implicit_tag(i_supply_medium_info_type_inline1_codec, retval.supply_medium_info_type, 128, 13, true, "supply_medium_info_type");
      retval.place_on_hold = (java.math.BigInteger)sm.implicit_tag(i_place_on_hold_type_codec, retval.place_on_hold, 128, 14, false, "place_on_hold");
      retval.client_id = (Client_Id_type)sm.implicit_tag(i_client_id_codec, retval.client_id, 128, 15, true, "client_id");
      retval.item_id = (Item_Id_type)sm.implicit_tag(i_item_id_codec, retval.item_id, 128, 16, false, "item_id");
      retval.supplemental_item_description = (java.util.Vector)sm.implicit_tag(i_supplemental_item_description_codec, retval.supplemental_item_description, 128, 17, true, "supplemental_item_description");
      retval.cost_info_type = (Cost_Info_Type_type)sm.implicit_tag(i_cost_info_type_codec, retval.cost_info_type, 128, 18, true, "cost_info_type");
      retval.copyright_compliance = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.copyright_compliance, 128, 19, true, "copyright_compliance");
      retval.third_party_info_type = (Third_Party_Info_Type_type)sm.implicit_tag(i_third_party_info_type_codec, retval.third_party_info_type, 128, 20, true, "third_party_info_type");
      retval.retry_flag = (Boolean)sm.implicit_tag(i_bool_codec, retval.retry_flag, 128, 21, false, "retry_flag");
      retval.forward_flag = (Boolean)sm.implicit_tag(i_bool_codec, retval.forward_flag, 128, 22, false, "forward_flag");
      retval.requester_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.requester_note, 128, 46, true, "requester_note");
      retval.forward_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.forward_note, 128, 47, true, "forward_note");
      retval.iLL_request_extensions = (java.util.Vector)sm.implicit_tag(i_ill_request_extensions_inline2_codec, retval.iLL_request_extensions, 128, 49, true, "iLL_request_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
