package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Person_Or_Institution_Symbol_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Person_Or_Institution_Symbol_codec.class);
  public static Person_Or_Institution_Symbol_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(0), ILL_String_codec.getCodec() , "person_symbol", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), ILL_String_codec.getCodec() , "institution_symbol", new Integer(1) }
  };

  public synchronized static Person_Or_Institution_Symbol_codec getCodec()
  {
    if ( me == null )
    {
      me = new Person_Or_Institution_Symbol_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Person_Or_Institution_Symbol_type retval = (Person_Or_Institution_Symbol_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Person_Or_Institution_Symbol_type();
        retval = (Person_Or_Institution_Symbol_type)sm.choice(retval, choice_info, type_name);
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
