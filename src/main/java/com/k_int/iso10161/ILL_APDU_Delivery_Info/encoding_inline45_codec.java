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
public class encoding_inline45_codec extends base_codec
{
  private static Log log = LogFactory.getLog(encoding_inline45_codec.class);
  public static encoding_inline45_codec me = null;

  private APDU_Encoding_codec i_apdu_encoding_codec = APDU_Encoding_codec.getCodec();

  public synchronized static encoding_inline45_codec getCodec()
  {
    if ( me == null )
    {
      me = new encoding_inline45_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    java.util.Vector retval = (java.util.Vector)type_instance;

    if ( ( ( sm.getDirection() == SerializationManager.DIRECTION_ENCODE ) && ( retval != null ) ) ||
         ( sm.getDirection() == SerializationManager.DIRECTION_DECODE ) )
    {
      if ( sm.sequenceBegin() )
      {
        if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
        {
            retval = new java.util.Vector();
        }

        retval = sm.sequenceOf(retval, i_apdu_encoding_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
