package com.k_int.iso10161.Internal_Reference_Number;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Internal_Reference_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Internal_Reference_Type_codec.class);
  public static Internal_Reference_Type_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Internal_Reference_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Internal_Reference_Type_codec();
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
    Internal_Reference_Type_type retval = (Internal_Reference_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Internal_Reference_Type_type();
      }

      retval.reference_authority = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.reference_authority, 128, 0, true, "reference_authority");
      retval.internal_reference = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.internal_reference, 128, 1, false, "internal_reference");
      sm.sequenceEnd();
    }

    return retval;
  }

}
