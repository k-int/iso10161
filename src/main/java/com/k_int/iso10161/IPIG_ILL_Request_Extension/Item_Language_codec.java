package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Item_Language_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Item_Language_codec.class);
  public static Item_Language_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Item_Language_codec getCodec()
  {
    if ( me == null )
    {
      me = new Item_Language_codec();
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

        retval = sm.sequenceOf(retval, i_ill_string_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
