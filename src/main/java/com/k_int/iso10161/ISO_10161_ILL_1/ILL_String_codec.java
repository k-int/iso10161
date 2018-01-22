package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class ILL_String_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ILL_String_codec.class);
  public static ILL_String_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), GeneralString_codec.getCodec() , "GeneralString_var", new Integer(0) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), EDIFACTString_codec.getCodec() , "EDIFACTString_var", new Integer(1) }
  };

  public synchronized static ILL_String_codec getCodec()
  {
    if ( me == null )
    {
      me = new ILL_String_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    ILL_String_type retval = (ILL_String_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new ILL_String_type();
        retval = (ILL_String_type)sm.choice(retval, choice_info, type_name);
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
