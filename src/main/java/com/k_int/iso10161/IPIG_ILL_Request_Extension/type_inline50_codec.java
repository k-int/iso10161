package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class type_inline50_codec extends base_codec
{
  private static Log log = LogFactory.getLog(type_inline50_codec.class);
  public static type_inline50_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), NULL_codec.getCodec() , "phD_dissertation", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(2), NULL_codec.getCodec() , "masters_thesis", new Integer(1) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(3), NULL_codec.getCodec() , "undergraduate_honors_thesis", new Integer(2) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(4), ILL_String_codec.getCodec() , "other", new Integer(3) }
  };

  public synchronized static type_inline50_codec getCodec()
  {
    if ( me == null )
    {
      me = new type_inline50_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    type_inline50_type retval = (type_inline50_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new type_inline50_type();
        retval = (type_inline50_type)sm.choice(retval, choice_info, type_name);
      }
      else
      {
        if ( retval != null )
          sm.choice(retval, choice_info, type_name);
      }

      if ( ( retval==null ) && ( !is_optional ) )
      {
        log.info("Missing mandatory choice for "+type_name);
      }

    return retval;
  }

}
