package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Estimate_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Estimate_Results_codec.class);
  public static Estimate_Results_codec me = null;

  private locations_inline30_codec i_locations_inline30_codec = locations_inline30_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Estimate_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Estimate_Results_codec();
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
    Estimate_Results_type retval = (Estimate_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Estimate_Results_type();
      }

      retval.cost_estimate = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.cost_estimate, 128, 0, false, "cost_estimate");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline30_codec, retval.locations, 128, 1, true, "locations");
      sm.sequenceEnd();
    }

    return retval;
  }

}
