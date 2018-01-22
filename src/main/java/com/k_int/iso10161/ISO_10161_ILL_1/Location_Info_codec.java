package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Location_Info_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Location_Info_codec.class);
  public static Location_Info_codec me = null;

  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Location_Info_codec getCodec()
  {
    if ( me == null )
    {
      me = new Location_Info_codec();
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
    Location_Info_type retval = (Location_Info_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Location_Info_type();
      }

      retval.location_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.location_id, 128, 0, false, "location_id");
      retval.location_address = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.location_address, 128, 1, true, "location_address");
      retval.location_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.location_note, 128, 2, true, "location_note");
      sm.sequenceEnd();
    }

    return retval;
  }

}
