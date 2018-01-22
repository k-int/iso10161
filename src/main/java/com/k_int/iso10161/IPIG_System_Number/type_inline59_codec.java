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
public class type_inline59_codec extends base_codec
{
  private static Log log = LogFactory.getLog(type_inline59_codec.class);
  public static type_inline59_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), Well_Known_System_codec.getCodec() , "well_known", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), System_Id_codec.getCodec() , "other", new Integer(1) }
  };

  public synchronized static type_inline59_codec getCodec()
  {
    if ( me == null )
    {
      me = new type_inline59_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    type_inline59_type retval = (type_inline59_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new type_inline59_type();
        retval = (type_inline59_type)sm.choice(retval, choice_info, type_name);
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
