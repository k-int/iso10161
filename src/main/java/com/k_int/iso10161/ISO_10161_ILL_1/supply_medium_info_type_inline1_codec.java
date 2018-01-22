package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class supply_medium_info_type_inline1_codec extends base_codec
{
  private static Log log = LogFactory.getLog(supply_medium_info_type_inline1_codec.class);
  public static supply_medium_info_type_inline1_codec me = null;

  private Supply_Medium_Info_Type_codec i_supply_medium_info_type_codec = Supply_Medium_Info_Type_codec.getCodec();

  public synchronized static supply_medium_info_type_inline1_codec getCodec()
  {
    if ( me == null )
    {
      me = new supply_medium_info_type_inline1_codec();
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

        retval = sm.sequenceOf(retval, i_supply_medium_info_type_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
