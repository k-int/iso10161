package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Locations_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Locations_Results_codec.class);
  public static Locations_Results_codec me = null;

  private locations_inline32_codec i_locations_inline32_codec = locations_inline32_codec.getCodec();
  private Reason_Locs_Provided_codec i_reason_locs_provided_codec = Reason_Locs_Provided_codec.getCodec();

  public synchronized static Locations_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Locations_Results_codec();
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
    Locations_Results_type retval = (Locations_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Locations_Results_type();
      }

      retval.reason_locs_provided = (java.math.BigInteger)sm.implicit_tag(i_reason_locs_provided_codec, retval.reason_locs_provided, 128, 0, true, "reason_locs_provided");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline32_codec, retval.locations, 128, 1, false, "locations");
      sm.sequenceEnd();
    }

    return retval;
  }

}
