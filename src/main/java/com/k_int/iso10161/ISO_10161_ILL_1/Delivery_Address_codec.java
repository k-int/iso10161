package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Delivery_Address_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Delivery_Address_codec.class);
  public static Delivery_Address_codec me = null;

  private Postal_Address_codec i_postal_address_codec = Postal_Address_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();

  public synchronized static Delivery_Address_codec getCodec()
  {
    if ( me == null )
    {
      me = new Delivery_Address_codec();
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
    Delivery_Address_type retval = (Delivery_Address_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Delivery_Address_type();
      }

      retval.postal_address = (Postal_Address_type)sm.implicit_tag(i_postal_address_codec, retval.postal_address, 128, 0, true, "postal_address");
      retval.electronic_address = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.electronic_address, 128, 1, true, "electronic_address");
      sm.sequenceEnd();
    }

    return retval;
  }

}
