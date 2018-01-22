package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Retry_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Retry_Results_codec.class);
  public static Retry_Results_codec me = null;

  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();
  private locations_inline33_codec i_locations_inline33_codec = locations_inline33_codec.getCodec();

  public synchronized static Retry_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Retry_Results_codec();
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
    Retry_Results_type retval = (Retry_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Retry_Results_type();
      }

      retval.reason_not_available = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.reason_not_available, 128, 0, true, "reason_not_available");
      retval.retry_date = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.retry_date, 128, 1, true, "retry_date");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline33_codec, retval.locations, 128, 2, true, "locations");
      sm.sequenceEnd();
    }

    return retval;
  }

}
