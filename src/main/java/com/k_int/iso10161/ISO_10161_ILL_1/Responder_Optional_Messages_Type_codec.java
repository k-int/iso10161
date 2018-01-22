package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Responder_Optional_Messages_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Responder_Optional_Messages_Type_codec.class);
  public static Responder_Optional_Messages_Type_codec me = null;

  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Responder_Optional_Messages_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Responder_Optional_Messages_Type_codec();
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
    Responder_Optional_Messages_Type_type retval = (Responder_Optional_Messages_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Responder_Optional_Messages_Type_type();
      }

      retval.can_send_SHIPPED = (Boolean)sm.implicit_tag(i_bool_codec, retval.can_send_SHIPPED, 128, 0, false, "can_send_SHIPPED");
      retval.can_send_CHECKED_IN = (Boolean)sm.implicit_tag(i_bool_codec, retval.can_send_CHECKED_IN, 128, 1, false, "can_send_CHECKED_IN");
      retval.responder_RECEIVED = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.responder_RECEIVED, 128, 2, false, "responder_RECEIVED");
      retval.responder_RETURNED = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.responder_RETURNED, 128, 3, false, "responder_RETURNED");
      sm.sequenceEnd();
    }

    return retval;
  }

}
