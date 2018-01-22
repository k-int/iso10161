package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class System_Address_codec extends base_codec
{
  private static Log log = LogFactory.getLog(System_Address_codec.class);
  public static System_Address_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static System_Address_codec getCodec()
  {
    if ( me == null )
    {
      me = new System_Address_codec();
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
    System_Address_type retval = (System_Address_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new System_Address_type();
      }

      retval.telecom_service_identifier = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.telecom_service_identifier, 128, 0, true, "telecom_service_identifier");
      retval.telecom_service_address = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.telecom_service_address, 128, 1, true, "telecom_service_address");
      sm.sequenceEnd();
    }

    return retval;
  }

}
