package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Shipped_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Shipped_codec.class);
  public static Shipped_codec me = null;

  private Supply_Details_codec i_supply_details_codec = Supply_Details_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Responder_Optional_Messages_Type_codec i_responder_optional_messages_type_codec = Responder_Optional_Messages_Type_codec.getCodec();
  private Postal_Address_codec i_postal_address_codec = Postal_Address_codec.getCodec();
  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private Shipped_Service_Type_codec i_shipped_service_type_codec = Shipped_Service_Type_codec.getCodec();
  private Supplemental_Item_Description_codec i_supplemental_item_description_codec = Supplemental_Item_Description_codec.getCodec();
  private Transaction_Type_codec i_transaction_type_codec = Transaction_Type_codec.getCodec();
  private Client_Id_codec i_client_id_codec = Client_Id_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();
  private shipped_extensions_inline4_codec i_shipped_extensions_inline4_codec = shipped_extensions_inline4_codec.getCodec();

  public synchronized static Shipped_codec getCodec()
  {
    if ( me == null )
    {
      me = new Shipped_codec();
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
    Shipped_type retval = (Shipped_type)type_instance;

    if ( sm.constructedBegin(64, 3) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Shipped_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.responder_address = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.responder_address, 128, 24, true, "responder_address");
      retval.intermediary_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.intermediary_id, 128, 25, true, "intermediary_id");
      retval.supplier_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.supplier_id, 128, 26, true, "supplier_id");
      retval.client_id = (Client_Id_type)sm.implicit_tag(i_client_id_codec, retval.client_id, 128, 15, true, "client_id");
      retval.transaction_type = (java.math.BigInteger)sm.implicit_tag(i_transaction_type_codec, retval.transaction_type, 128, 5, false, "transaction_type");
      retval.supplemental_item_description = (java.util.Vector)sm.implicit_tag(i_supplemental_item_description_codec, retval.supplemental_item_description, 128, 17, true, "supplemental_item_description");
      retval.shipped_service_type = (java.math.BigInteger)sm.implicit_tag(i_shipped_service_type_codec, retval.shipped_service_type, 128, 27, false, "shipped_service_type");
      retval.responder_optional_messages = (Responder_Optional_Messages_Type_type)sm.implicit_tag(i_responder_optional_messages_type_codec, retval.responder_optional_messages, 128, 28, true, "responder_optional_messages");
      retval.supply_details = (Supply_Details_type)sm.implicit_tag(i_supply_details_codec, retval.supply_details, 128, 29, false, "supply_details");
      retval.return_to_address = (Postal_Address_type)sm.implicit_tag(i_postal_address_codec, retval.return_to_address, 128, 30, true, "return_to_address");
      retval.responder_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.responder_note, 128, 46, true, "responder_note");
      retval.shipped_extensions = (java.util.Vector)sm.implicit_tag(i_shipped_extensions_inline4_codec, retval.shipped_extensions, 128, 49, true, "shipped_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
