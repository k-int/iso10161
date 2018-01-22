package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class results_explanation_inline5_codec extends base_codec
{
  private static Log log = LogFactory.getLog(results_explanation_inline5_codec.class);
  public static results_explanation_inline5_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), Conditional_Results_codec.getCodec() , "conditional_results", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), Retry_Results_codec.getCodec() , "retry_results", new Integer(1) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(3), Unfilled_Results_codec.getCodec() , "unfilled_results", new Integer(2) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(4), Locations_Results_codec.getCodec() , "locations_results", new Integer(3) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(5), Will_Supply_Results_codec.getCodec() , "will_supply_results", new Integer(4) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(6), Hold_Placed_Results_codec.getCodec() , "hold_placed_results", new Integer(5) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(7), Estimate_Results_codec.getCodec() , "estimate_results", new Integer(6) }
  };

  public synchronized static results_explanation_inline5_codec getCodec()
  {
    if ( me == null )
    {
      me = new results_explanation_inline5_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    results_explanation_inline5_type retval = (results_explanation_inline5_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new results_explanation_inline5_type();
        retval = (results_explanation_inline5_type)sm.choice(retval, choice_info, type_name);
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
