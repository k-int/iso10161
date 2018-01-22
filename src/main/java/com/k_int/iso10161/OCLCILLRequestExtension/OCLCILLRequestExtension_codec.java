package com.k_int.iso10161.OCLCILLRequestExtension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class OCLCILLRequestExtension_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLCILLRequestExtension_codec.class);
  public static OCLCILLRequestExtension_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static OCLCILLRequestExtension_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLCILLRequestExtension_codec();
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
    OCLCILLRequestExtension_type retval = (OCLCILLRequestExtension_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new OCLCILLRequestExtension_type();
      }

      retval.clientDepartment = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.clientDepartment, 128, 0, true, "clientDepartment");
      retval.paymentMethod = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.paymentMethod, 128, 1, true, "paymentMethod");
      retval.uniformTitle = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.uniformTitle, 128, 2, true, "uniformTitle");
      retval.dissertation = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.dissertation, 128, 3, true, "dissertation");
      retval.issueNumber = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.issueNumber, 128, 4, true, "issueNumber");
      retval.volume = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.volume, 128, 5, true, "volume");
      retval.affiliations = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.affiliations, 128, 6, true, "affiliations");
      retval.source = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.source, 128, 7, true, "source");
      sm.sequenceEnd();
    }

    return retval;
  }

}
