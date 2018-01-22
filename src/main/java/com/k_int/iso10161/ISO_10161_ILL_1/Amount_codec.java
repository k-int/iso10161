package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Amount_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Amount_codec.class);
  public static Amount_codec me = null;

  private PrintableString_codec i_printablestring_codec = PrintableString_codec.getCodec();
  private AmountString_codec i_amountstring_codec = AmountString_codec.getCodec();

  public synchronized static Amount_codec getCodec()
  {
    if ( me == null )
    {
      me = new Amount_codec();
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
    Amount_type retval = (Amount_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Amount_type();
      }

      retval.currency_code = (java.lang.String)sm.implicit_tag(i_printablestring_codec, retval.currency_code, 128, 0, true, "currency_code");
      retval.monetary_value = (java.lang.String)sm.implicit_tag(i_amountstring_codec, retval.monetary_value, 128, 1, false, "monetary_value");
      sm.sequenceEnd();
    }

    return retval;
  }

}
