package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Security_Problem_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Security_Problem_codec.class);
  public static Security_Problem_codec me = null;

  // handle on parents base encode function
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Security_Problem_codec getCodec()
  {
    if ( me == null )
    {
      me = new Security_Problem_codec();
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
