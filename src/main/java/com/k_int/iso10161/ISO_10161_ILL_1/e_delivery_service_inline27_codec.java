package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class e_delivery_service_inline27_codec extends base_codec
{
  private static Log log = LogFactory.getLog(e_delivery_service_inline27_codec.class);
  public static e_delivery_service_inline27_codec me = null;

  private Any_codec i_any_codec = Any_codec.getCodec();
  private OID_codec i_oid_codec = OID_codec.getCodec();

  public synchronized static e_delivery_service_inline27_codec getCodec()
  {
    if ( me == null )
    {
      me = new e_delivery_service_inline27_codec();
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
    e_delivery_service_inline27_type retval = (e_delivery_service_inline27_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new e_delivery_service_inline27_type();
      }

      retval.e_delivery_mode = (int[])sm.implicit_tag(i_oid_codec, retval.e_delivery_mode, 128, 0, false, "e_delivery_mode");
      retval.e_delivery_parameters = (Object)sm.explicit_tag(i_any_codec, retval.e_delivery_parameters, 128, 1, false, "e_delivery_parameters");
      sm.sequenceEnd();
    }

    return retval;
  }

}
