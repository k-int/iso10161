package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Element_Truncated_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Element_Truncated_codec.class);
  public static Element_Truncated_codec me = null;

  private Identifier_codec i_identifier_codec = Identifier_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Element_Truncated_codec getCodec()
  {
    if ( me == null )
    {
      me = new Element_Truncated_codec();
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
    Element_Truncated_type retval = (Element_Truncated_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Element_Truncated_type();
      }

      retval.element = (ILL_String_type)sm.explicit_tag(i_identifier_codec, retval.element, 128, 0, false, "element");
      retval.truncated_value = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.truncated_value, 128, 1, false, "truncated_value");
      sm.sequenceEnd();
    }

    return retval;
  }

}
