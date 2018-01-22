package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Identifier_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Identifier_codec.class);
  public static Identifier_codec me = null;

  // handle on parents base encode function
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Identifier_codec getCodec()
  {
    if ( me == null )
    {
      me = new Identifier_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_ill_string_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
