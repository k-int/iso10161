package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class iLL_service_type_inline0_codec extends base_codec
{
  private static Log log = LogFactory.getLog(iLL_service_type_inline0_codec.class);
  public static iLL_service_type_inline0_codec me = null;

  private ILL_Service_Type_codec i_ill_service_type_codec = ILL_Service_Type_codec.getCodec();

  public synchronized static iLL_service_type_inline0_codec getCodec()
  {
    if ( me == null )
    {
      me = new iLL_service_type_inline0_codec();
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

        retval = sm.sequenceOf(retval, i_ill_service_type_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
