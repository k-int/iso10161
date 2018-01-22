package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Status_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Status_Report_codec.class);
  public static Status_Report_codec me = null;

  private Current_State_codec i_current_state_codec = Current_State_codec.getCodec();
  private History_Report_codec i_history_report_codec = History_Report_codec.getCodec();

  public synchronized static Status_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new Status_Report_codec();
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
    Status_Report_type retval = (Status_Report_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Status_Report_type();
      }

      retval.user_status_report = (History_Report_type)sm.implicit_tag(i_history_report_codec, retval.user_status_report, 128, 0, false, "user_status_report");
      retval.provider_status_report = (java.math.BigInteger)sm.implicit_tag(i_current_state_codec, retval.provider_status_report, 128, 1, false, "provider_status_report");
      sm.sequenceEnd();
    }

    return retval;
  }

}
