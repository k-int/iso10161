package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class no_of_units_per_medium_inline38_codec extends base_codec
{
  private static Log log = LogFactory.getLog(no_of_units_per_medium_inline38_codec.class);
  public static no_of_units_per_medium_inline38_codec me = null;

  private Units_Per_Medium_Type_codec i_units_per_medium_type_codec = Units_Per_Medium_Type_codec.getCodec();

  public synchronized static no_of_units_per_medium_inline38_codec getCodec()
  {
    if ( me == null )
    {
      me = new no_of_units_per_medium_inline38_codec();
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

        retval = sm.sequenceOf(retval, i_units_per_medium_type_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
