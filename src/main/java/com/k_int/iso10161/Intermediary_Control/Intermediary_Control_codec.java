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
public class Intermediary_Control_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Intermediary_Control_codec.class);
  public static Intermediary_Control_codec me = null;

  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Intermediary_Responder_Control_codec i_intermediary_responder_control_codec = Intermediary_Responder_Control_codec.getCodec();
  private Intermediary_Actions_codec i_intermediary_actions_codec = Intermediary_Actions_codec.getCodec();

  public synchronized static Intermediary_Control_codec getCodec()
  {
    if ( me == null )
    {
      me = new Intermediary_Control_codec();
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
    Intermediary_Control_type retval = (Intermediary_Control_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Intermediary_Control_type();
      }

      retval.actionFlag = (java.math.BigInteger)sm.implicit_tag(i_intermediary_actions_codec, retval.actionFlag, 128, 0, false, "actionFlag");
      retval.lastResponder = (Intermediary_Responder_Control_type)sm.implicit_tag(i_intermediary_responder_control_codec, retval.lastResponder, 128, 1, true, "lastResponder");
      retval.currentResponderId = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.currentResponderId, 128, 2, true, "currentResponderId");
      sm.sequenceEnd();
    }

    return retval;
  }

}
