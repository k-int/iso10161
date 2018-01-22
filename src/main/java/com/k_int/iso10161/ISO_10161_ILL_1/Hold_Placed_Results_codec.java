package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Hold_Placed_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Hold_Placed_Results_codec.class);
  public static Hold_Placed_Results_codec me = null;

  private Medium_Type_codec i_medium_type_codec = Medium_Type_codec.getCodec();
  private locations_inline31_codec i_locations_inline31_codec = locations_inline31_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();

  public synchronized static Hold_Placed_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Hold_Placed_Results_codec();
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
    Hold_Placed_Results_type retval = (Hold_Placed_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Hold_Placed_Results_type();
      }

      retval.estimated_date_available = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.estimated_date_available, 128, 0, false, "estimated_date_available");
      retval.hold_placed_medium_type = (java.math.BigInteger)sm.implicit_tag(i_medium_type_codec, retval.hold_placed_medium_type, 128, 1, true, "hold_placed_medium_type");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline31_codec, retval.locations, 128, 2, true, "locations");
      sm.sequenceEnd();
    }

    return retval;
  }

}
