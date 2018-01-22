package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class bank_electronic_payment_inline55_codec extends base_codec
{
  private static Log log = LogFactory.getLog(bank_electronic_payment_inline55_codec.class);
  public static bank_electronic_payment_inline55_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static bank_electronic_payment_inline55_codec getCodec()
  {
    if ( me == null )
    {
      me = new bank_electronic_payment_inline55_codec();
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
    bank_electronic_payment_inline55_type retval = (bank_electronic_payment_inline55_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new bank_electronic_payment_inline55_type();
      }

      retval.bank_name = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.bank_name, 128, 1, false, "bank_name");
      retval.bank_address = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.bank_address, 128, 2, false, "bank_address");
      retval.routing_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.routing_number, 128, 3, false, "routing_number");
      retval.account_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.account_number, 128, 4, false, "account_number");
      sm.sequenceEnd();
    }

    return retval;
  }

}
