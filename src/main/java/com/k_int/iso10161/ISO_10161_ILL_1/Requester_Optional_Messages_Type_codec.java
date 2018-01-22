package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Requester_Optional_Messages_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Requester_Optional_Messages_Type_codec.class);
  public static Requester_Optional_Messages_Type_codec me = null;

  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Requester_Optional_Messages_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Requester_Optional_Messages_Type_codec();
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
    Requester_Optional_Messages_Type_type retval = (Requester_Optional_Messages_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Requester_Optional_Messages_Type_type();
      }

      retval.can_send_RECEIVED = (Boolean)sm.implicit_tag(i_bool_codec, retval.can_send_RECEIVED, 128, 0, false, "can_send_RECEIVED");
      retval.can_send_RETURNED = (Boolean)sm.implicit_tag(i_bool_codec, retval.can_send_RETURNED, 128, 1, false, "can_send_RETURNED");
      retval.requester_SHIPPED = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.requester_SHIPPED, 128, 2, false, "requester_SHIPPED");
      retval.requester_CHECKED_IN = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.requester_CHECKED_IN, 128, 3, false, "requester_CHECKED_IN");
      sm.sequenceEnd();
    }

    return retval;
  }

}
