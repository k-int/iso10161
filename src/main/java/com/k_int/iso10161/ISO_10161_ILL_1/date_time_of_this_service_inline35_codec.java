package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class date_time_of_this_service_inline35_codec extends base_codec
{
  private static Log log = LogFactory.getLog(date_time_of_this_service_inline35_codec.class);
  public static date_time_of_this_service_inline35_codec me = null;

  private ISO_Time_codec i_iso_time_codec = ISO_Time_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();

  public synchronized static date_time_of_this_service_inline35_codec getCodec()
  {
    if ( me == null )
    {
      me = new date_time_of_this_service_inline35_codec();
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
    date_time_of_this_service_inline35_type retval = (date_time_of_this_service_inline35_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new date_time_of_this_service_inline35_type();
      }

      retval.date = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date, 128, 0, false, "date");
      retval.time = (java.lang.String)sm.implicit_tag(i_iso_time_codec, retval.time, 128, 1, true, "time");
      sm.sequenceEnd();
    }

    return retval;
  }

}
