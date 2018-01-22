package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Error_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Error_Report_codec.class);
  public static Error_Report_codec me = null;

  private Report_Source_codec i_report_source_codec = Report_Source_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private User_Error_Report_codec i_user_error_report_codec = User_Error_Report_codec.getCodec();
  private Provider_Error_Report_codec i_provider_error_report_codec = Provider_Error_Report_codec.getCodec();

  public synchronized static Error_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new Error_Report_codec();
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
    Error_Report_type retval = (Error_Report_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Error_Report_type();
      }

      retval.correlation_information = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.correlation_information, 128, 0, false, "correlation_information");
      retval.report_source = (java.math.BigInteger)sm.implicit_tag(i_report_source_codec, retval.report_source, 128, 1, false, "report_source");
      retval.user_error_report = (User_Error_Report_type)sm.explicit_tag(i_user_error_report_codec, retval.user_error_report, 128, 2, true, "user_error_report");
      retval.provider_error_report = (Provider_Error_Report_type)sm.explicit_tag(i_provider_error_report_codec, retval.provider_error_report, 128, 3, true, "provider_error_report");
      sm.sequenceEnd();
    }

    return retval;
  }

}
