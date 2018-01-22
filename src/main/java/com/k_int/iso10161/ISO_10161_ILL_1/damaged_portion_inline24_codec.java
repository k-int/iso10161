package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class damaged_portion_inline24_codec extends base_codec
{
  private static Log log = LogFactory.getLog(damaged_portion_inline24_codec.class);
  public static damaged_portion_inline24_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), NULL_codec.getCodec() , "complete_document", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(2), specific_units_inline25_codec.getCodec() , "specific_units", new Integer(1) }
  };

  public synchronized static damaged_portion_inline24_codec getCodec()
  {
    if ( me == null )
    {
      me = new damaged_portion_inline24_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    damaged_portion_inline24_type retval = (damaged_portion_inline24_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new damaged_portion_inline24_type();
        retval = (damaged_portion_inline24_type)sm.choice(retval, choice_info, type_name);
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
