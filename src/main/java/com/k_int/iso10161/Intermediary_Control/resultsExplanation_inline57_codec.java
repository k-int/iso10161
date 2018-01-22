package com.k_int.iso10161.Intermediary_Control;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Results_codec;
import java.math.BigInteger;
import com.k_int.iso10161.ISO_10161_ILL_1.Conditional_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Conditional_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Retry_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Retry_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Unfilled_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Unfilled_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Locations_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Locations_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Will_Supply_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Will_Supply_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Hold_Placed_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Hold_Placed_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Estimate_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Estimate_Results_type;
public class resultsExplanation_inline57_codec extends base_codec
{
  private static Log log = LogFactory.getLog(resultsExplanation_inline57_codec.class);
  public static resultsExplanation_inline57_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), Conditional_Results_codec.getCodec() , "conditionalResults", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), Retry_Results_codec.getCodec() , "retryResults", new Integer(1) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(3), Unfilled_Results_codec.getCodec() , "unfilledResults", new Integer(2) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(4), Locations_Results_codec.getCodec() , "locationsResults", new Integer(3) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(5), Will_Supply_Results_codec.getCodec() , "willSupplyResults", new Integer(4) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(6), Hold_Placed_Results_codec.getCodec() , "holdPlacedResults", new Integer(5) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(7), Estimate_Results_codec.getCodec() , "estimateResults", new Integer(6) }
  };

  public synchronized static resultsExplanation_inline57_codec getCodec()
  {
    if ( me == null )
    {
      me = new resultsExplanation_inline57_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    resultsExplanation_inline57_type retval = (resultsExplanation_inline57_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new resultsExplanation_inline57_type();
        retval = (resultsExplanation_inline57_type)sm.choice(retval, choice_info, type_name);
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
