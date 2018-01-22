package com.k_int.iso10161.ILL_APDU_Delivery_Info;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
public class APDU_Encoding_codec extends base_codec
{
  private static Log log = LogFactory.getLog(APDU_Encoding_codec.class);
  public static APDU_Encoding_codec me = null;

  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static APDU_Encoding_codec getCodec()
  {
    if ( me == null )
    {
      me = new APDU_Encoding_codec();
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
