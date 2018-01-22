package com.k_int.iso10161.OCLC_Prism_ILL_Error;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class OCLC_Prism_Ill_Error_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLC_Prism_Ill_Error_codec.class);
  public static OCLC_Prism_Ill_Error_codec me = null;

  private OCLC_Prism_Ill_ErrorItem41_codec i_oclc_prism_ill_erroritem41_codec = OCLC_Prism_Ill_ErrorItem41_codec.getCodec();

  public synchronized static OCLC_Prism_Ill_Error_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLC_Prism_Ill_Error_codec();
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

        retval = sm.sequenceOf(retval, i_oclc_prism_ill_erroritem41_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
