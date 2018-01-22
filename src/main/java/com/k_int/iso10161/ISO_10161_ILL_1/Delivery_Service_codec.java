package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Delivery_Service_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Delivery_Service_codec.class);
  public static Delivery_Service_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(7), Transportation_Mode_codec.getCodec() , "physical_delivery", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(50), electronic_delivery_inline26_codec.getCodec() , "electronic_delivery", new Integer(1) }
  };

  public synchronized static Delivery_Service_codec getCodec()
  {
    if ( me == null )
    {
      me = new Delivery_Service_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Delivery_Service_type retval = (Delivery_Service_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Delivery_Service_type();
        retval = (Delivery_Service_type)sm.choice(retval, choice_info, type_name);
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
