package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Extension_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Extension_codec.class);
  public static Extension_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private Any_codec i_any_codec = Any_codec.getCodec();

  public synchronized static Extension_codec getCodec()
  {
    if ( me == null )
    {
      me = new Extension_codec();
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
    Extension_type retval = (Extension_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Extension_type();
      }

      retval.identifier = (BigInteger)sm.implicit_tag(i_integer_codec, retval.identifier, 128, 0, false, "identifier");
      retval.critical = (Boolean)sm.implicit_tag(i_bool_codec, retval.critical, 128, 1, false, "critical");
      retval.item = (Object)sm.explicit_tag(i_any_codec, retval.item, 128, 2, false, "item");
      sm.sequenceEnd();
    }

    return retval;
  }

}
