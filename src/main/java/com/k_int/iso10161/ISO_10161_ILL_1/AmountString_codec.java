package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class AmountString_codec extends base_codec
{
  private static Log log = LogFactory.getLog(AmountString_codec.class);
  public static AmountString_codec me = null;

  // handle on parents base encode function
  private PrintableString_codec i_printablestring_codec = PrintableString_codec.getCodec();

  public synchronized static AmountString_codec getCodec()
  {
    if ( me == null )
    {
      me = new AmountString_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_printablestring_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
