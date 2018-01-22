package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Returned_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Returned_codec.class);
  public static Returned_codec me = null;

  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private Amount_codec i_amount_codec = Amount_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private returned_extensions_inline12_codec i_returned_extensions_inline12_codec = returned_extensions_inline12_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();
  private Transportation_Mode_codec i_transportation_mode_codec = Transportation_Mode_codec.getCodec();
  private Supplemental_Item_Description_codec i_supplemental_item_description_codec = Supplemental_Item_Description_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Integer_codec i_integer_codec = Integer_codec.getCodec();

  public synchronized static Returned_codec getCodec()
  {
    if ( me == null )
    {
      me = new Returned_codec();
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
    Returned_type retval = (Returned_type)type_instance;

    if ( sm.constructedBegin(64, 10) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Returned_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.supplemental_item_description = (java.util.Vector)sm.implicit_tag(i_supplemental_item_description_codec, retval.supplemental_item_description, 128, 17, true, "supplemental_item_description");
      retval.date_returned = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_returned, 128, 37, false, "date_returned");
      retval.returned_via = (ILL_String_type)sm.explicit_tag(i_transportation_mode_codec, retval.returned_via, 128, 38, true, "returned_via");
      retval.insured_for = (Amount_type)sm.implicit_tag(i_amount_codec, retval.insured_for, 128, 39, true, "insured_for");
      retval.requester_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.requester_note, 128, 46, true, "requester_note");
      retval.returned_extensions = (java.util.Vector)sm.implicit_tag(i_returned_extensions_inline12_codec, retval.returned_extensions, 128, 49, true, "returned_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
