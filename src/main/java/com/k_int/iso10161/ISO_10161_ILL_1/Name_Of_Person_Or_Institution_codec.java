package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Name_Of_Person_Or_Institution_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Name_Of_Person_Or_Institution_codec.class);
  public static Name_Of_Person_Or_Institution_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(0), ILL_String_codec.getCodec() , "name_of_person", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), ILL_String_codec.getCodec() , "name_of_institution", new Integer(1) }
  };

  public synchronized static Name_Of_Person_Or_Institution_codec getCodec()
  {
    if ( me == null )
    {
      me = new Name_Of_Person_Or_Institution_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Name_Of_Person_Or_Institution_type retval = (Name_Of_Person_Or_Institution_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Name_Of_Person_Or_Institution_type();
        retval = (Name_Of_Person_Or_Institution_type)sm.choice(retval, choice_info, type_name);
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
