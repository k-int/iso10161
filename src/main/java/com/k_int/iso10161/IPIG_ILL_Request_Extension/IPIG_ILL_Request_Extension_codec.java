package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class IPIG_ILL_Request_Extension_codec extends base_codec
{
  private static Log log = LogFactory.getLog(IPIG_ILL_Request_Extension_codec.class);
  public static IPIG_ILL_Request_Extension_codec me = null;

  private IPIG_ILL_Request_Extension_choice49_codec i_ipig_ill_request_extension_choice49_codec = IPIG_ILL_Request_Extension_choice49_codec.getCodec();

  public synchronized static IPIG_ILL_Request_Extension_codec getCodec()
  {
    if ( me == null )
    {
      me = new IPIG_ILL_Request_Extension_codec();
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

        retval = sm.sequenceOf(retval, i_ipig_ill_request_extension_choice49_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
