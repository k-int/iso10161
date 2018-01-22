package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Status_Or_Error_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Status_Or_Error_Report_codec.class);
  public static Status_Or_Error_Report_codec me = null;

  private Status_Report_codec i_status_report_codec = Status_Report_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private Error_Report_codec i_error_report_codec = Error_Report_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private status_or_error_report_extensions_inline21_codec i_status_or_error_report_extensions_inline21_codec = status_or_error_report_extensions_inline21_codec.getCodec();
  private Reason_No_Report_codec i_reason_no_report_codec = Reason_No_Report_codec.getCodec();

  public synchronized static Status_Or_Error_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new Status_Or_Error_Report_codec();
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
    Status_Or_Error_Report_type retval = (Status_Or_Error_Report_type)type_instance;

    if ( sm.constructedBegin(64, 19) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Status_Or_Error_Report_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.reason_no_report = (java.math.BigInteger)sm.implicit_tag(i_reason_no_report_codec, retval.reason_no_report, 128, 43, true, "reason_no_report");
      retval.status_report = (Status_Report_type)sm.implicit_tag(i_status_report_codec, retval.status_report, 128, 44, true, "status_report");
      retval.error_report = (Error_Report_type)sm.implicit_tag(i_error_report_codec, retval.error_report, 128, 45, true, "error_report");
      retval.note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.note, 128, 46, true, "note");
      retval.status_or_error_report_extensions = (java.util.Vector)sm.implicit_tag(i_status_or_error_report_extensions_inline21_codec, retval.status_or_error_report_extensions, 128, 49, true, "status_or_error_report_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
