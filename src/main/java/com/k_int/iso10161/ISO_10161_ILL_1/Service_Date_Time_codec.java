package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Service_Date_Time_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Service_Date_Time_codec.class);
  public static Service_Date_Time_codec me = null;

  private date_time_of_original_service_inline36_codec i_date_time_of_original_service_inline36_codec = date_time_of_original_service_inline36_codec.getCodec();
  private date_time_of_this_service_inline35_codec i_date_time_of_this_service_inline35_codec = date_time_of_this_service_inline35_codec.getCodec();

  public synchronized static Service_Date_Time_codec getCodec()
  {
    if ( me == null )
    {
      me = new Service_Date_Time_codec();
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
    Service_Date_Time_type retval = (Service_Date_Time_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Service_Date_Time_type();
      }

      retval.date_time_of_this_service = (date_time_of_this_service_inline35_type)sm.implicit_tag(i_date_time_of_this_service_inline35_codec, retval.date_time_of_this_service, 128, 0, false, "date_time_of_this_service");
      retval.date_time_of_original_service = (date_time_of_original_service_inline36_type)sm.implicit_tag(i_date_time_of_original_service_inline36_codec, retval.date_time_of_original_service, 128, 1, true, "date_time_of_original_service");
      sm.sequenceEnd();
    }

    return retval;
  }

}
