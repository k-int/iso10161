package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Checked_In_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Checked_In_codec.class);
  public static Checked_In_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();
  private checked_in_extensions_inline13_codec i_checked_in_extensions_inline13_codec = checked_in_extensions_inline13_codec.getCodec();

  public synchronized static Checked_In_codec getCodec()
  {
    if ( me == null )
    {
      me = new Checked_In_codec();
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
    Checked_In_type retval = (Checked_In_type)type_instance;

    if ( sm.constructedBegin(64, 11) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Checked_In_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.date_checked_in = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_checked_in, 128, 40, false, "date_checked_in");
      retval.responder_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.responder_note, 128, 46, true, "responder_note");
      retval.checked_in_extensions = (java.util.Vector)sm.implicit_tag(i_checked_in_extensions_inline13_codec, retval.checked_in_extensions, 128, 49, true, "checked_in_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
