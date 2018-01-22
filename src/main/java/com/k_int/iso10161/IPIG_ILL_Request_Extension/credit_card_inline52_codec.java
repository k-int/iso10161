package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class credit_card_inline52_codec extends base_codec
{
  private static Log log = LogFactory.getLog(credit_card_inline52_codec.class);
  public static credit_card_inline52_codec me = null;

  private type_inline53_codec i_type_inline53_codec = type_inline53_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static credit_card_inline52_codec getCodec()
  {
    if ( me == null )
    {
      me = new credit_card_inline52_codec();
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
    credit_card_inline52_type retval = (credit_card_inline52_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new credit_card_inline52_type();
      }

      retval.type = (type_inline53_type)sm.explicit_tag(i_type_inline53_codec, retval.type, 128, 1, false, "type");
      retval.card_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.card_number, 128, 2, false, "card_number");
      retval.expiry_date = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.expiry_date, 128, 3, false, "expiry_date");
      retval.name_on_card = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.name_on_card, 128, 4, false, "name_on_card");
      sm.sequenceEnd();
    }

    return retval;
  }

}
