package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class User_Error_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(User_Error_Report_codec.class);
  public static User_Error_Report_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(0), Already_Forwarded_codec.getCodec() , "already_forwarded", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), Intermediary_Problem_codec.getCodec() , "intermediary_problem", new Integer(1) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), Security_Problem_codec.getCodec() , "security_problem", new Integer(2) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(3), Unable_To_Perform_codec.getCodec() , "unable_to_perform", new Integer(3) }
  };

  public synchronized static User_Error_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new User_Error_Report_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    User_Error_Report_type retval = (User_Error_Report_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new User_Error_Report_type();
        retval = (User_Error_Report_type)sm.choice(retval, choice_info, type_name);
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
