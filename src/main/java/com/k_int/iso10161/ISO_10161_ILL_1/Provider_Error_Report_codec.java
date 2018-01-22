package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Provider_Error_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Provider_Error_Report_codec.class);
  public static Provider_Error_Report_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(0), General_Problem_codec.getCodec() , "general_problem", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), Transaction_Id_Problem_codec.getCodec() , "transaction_id_problem", new Integer(1) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(2), State_Transition_Prohibited_codec.getCodec() , "state_transition_prohibited", new Integer(2) }
  };

  public synchronized static Provider_Error_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new Provider_Error_Report_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Provider_Error_Report_type retval = (Provider_Error_Report_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Provider_Error_Report_type();
        retval = (Provider_Error_Report_type)sm.choice(retval, choice_info, type_name);
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
