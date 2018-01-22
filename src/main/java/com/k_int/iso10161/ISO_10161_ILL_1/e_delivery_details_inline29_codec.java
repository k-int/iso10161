package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class e_delivery_details_inline29_codec extends base_codec
{
  private static Log log = LogFactory.getLog(e_delivery_details_inline29_codec.class);
  public static e_delivery_details_inline29_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(0), System_Address_codec.getCodec() , "e_delivery_address", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), System_Id_codec.getCodec() , "e_delivery_id", new Integer(1) }
  };

  public synchronized static e_delivery_details_inline29_codec getCodec()
  {
    if ( me == null )
    {
      me = new e_delivery_details_inline29_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    e_delivery_details_inline29_type retval = (e_delivery_details_inline29_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new e_delivery_details_inline29_type();
        retval = (e_delivery_details_inline29_type)sm.choice(retval, choice_info, type_name);
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
