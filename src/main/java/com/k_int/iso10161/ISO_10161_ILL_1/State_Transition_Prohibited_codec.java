package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class State_Transition_Prohibited_codec extends base_codec
{
  private static Log log = LogFactory.getLog(State_Transition_Prohibited_codec.class);
  public static State_Transition_Prohibited_codec me = null;

  private Current_State_codec i_current_state_codec = Current_State_codec.getCodec();
  private ILL_APDU_Type_codec i_ill_apdu_type_codec = ILL_APDU_Type_codec.getCodec();

  public synchronized static State_Transition_Prohibited_codec getCodec()
  {
    if ( me == null )
    {
      me = new State_Transition_Prohibited_codec();
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
    State_Transition_Prohibited_type retval = (State_Transition_Prohibited_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new State_Transition_Prohibited_type();
      }

      retval.aPDU_type = (java.math.BigInteger)sm.implicit_tag(i_ill_apdu_type_codec, retval.aPDU_type, 128, 0, false, "aPDU_type");
      retval.current_state = (java.math.BigInteger)sm.implicit_tag(i_current_state_codec, retval.current_state, 128, 1, false, "current_state");
      sm.sequenceEnd();
    }

    return retval;
  }

}
