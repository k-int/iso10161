package com.k_int.iso10161.OCLCSpecificResults;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class OCLCSpecificStatus_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLCSpecificStatus_codec.class);
  public static OCLCSpecificStatus_codec me = null;

  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static OCLCSpecificStatus_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLCSpecificStatus_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_enumerated_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
