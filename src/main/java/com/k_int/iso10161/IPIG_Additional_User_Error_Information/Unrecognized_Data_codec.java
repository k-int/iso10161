package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Unrecognized_Data_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Unrecognized_Data_codec.class);
  public static Unrecognized_Data_codec me = null;

  private Identifier_codec i_identifier_codec = Identifier_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Unrecognized_Data_codec getCodec()
  {
    if ( me == null )
    {
      me = new Unrecognized_Data_codec();
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
    Unrecognized_Data_type retval = (Unrecognized_Data_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Unrecognized_Data_type();
      }

      retval.element = (ILL_String_type)sm.explicit_tag(i_identifier_codec, retval.element, 128, 0, false, "element");
      retval.data = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.data, 128, 1, true, "data");
      retval.expected_format = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.expected_format, 128, 2, true, "expected_format");
      retval.supported_values = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.supported_values, 128, 3, true, "supported_values");
      sm.sequenceEnd();
    }

    return retval;
  }

}
