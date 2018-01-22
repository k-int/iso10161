package com.k_int.iso10161.IPIG_System_Number;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class IPIG_system_number_codec extends base_codec
{
  private static Log log = LogFactory.getLog(IPIG_system_number_codec.class);
  public static IPIG_system_number_codec me = null;

  private IPIG_system_numberItem58_codec i_ipig_system_numberitem58_codec = IPIG_system_numberItem58_codec.getCodec();

  public synchronized static IPIG_system_number_codec getCodec()
  {
    if ( me == null )
    {
      me = new IPIG_system_number_codec();
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

        retval = sm.sequenceOf(retval, i_ipig_system_numberitem58_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
