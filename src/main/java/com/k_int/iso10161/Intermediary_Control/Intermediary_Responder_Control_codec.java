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
public class Intermediary_Responder_Control_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Intermediary_Responder_Control_codec.class);
  public static Intermediary_Responder_Control_codec me = null;

  private resultsExplanation_inline57_codec i_resultsexplanation_inline57_codec = resultsExplanation_inline57_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Transaction_Results_codec i_transaction_results_codec = Transaction_Results_codec.getCodec();

  public synchronized static Intermediary_Responder_Control_codec getCodec()
  {
    if ( me == null )
    {
      me = new Intermediary_Responder_Control_codec();
    }
    return me;
  }

/** Convert this java type to or from a string of octets using the supplied 
 *  serialisation manager
 *  @author A2J Auto Generated Java Class
 *  @param sm The Serialisation Manager 
 *  @param type_instance If we are encoding, the type to encode.
 *  @param is_optional Flag indicating if this type is optional
 *  @param type_name The type name for diagnostic information
 *  @return A decoded java type or the type that was passed in for encoding
 */  
  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Intermediary_Responder_Control_type retval = (Intermediary_Responder_Control_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Intermediary_Responder_Control_type();
      }

      retval.transactionResults = (java.math.BigInteger)sm.implicit_tag(i_transaction_results_codec, retval.transactionResults, 128, 1, false, "transactionResults");
      retval.resultsExplanation = (resultsExplanation_inline57_type)sm.explicit_tag(i_resultsexplanation_inline57_codec, retval.resultsExplanation, 128, 2, true, "resultsExplanation");
      retval.responderId = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responderId, 128, 3, false, "responderId");
      sm.sequenceEnd();
    }

    return retval;
  }

}
