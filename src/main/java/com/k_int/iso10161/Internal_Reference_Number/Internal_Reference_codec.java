package com.k_int.iso10161.Internal_Reference_Number;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Internal_Reference_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Internal_Reference_codec.class);
  public static Internal_Reference_codec me = null;

  private Internal_Reference_Type_codec i_internal_reference_type_codec = Internal_Reference_Type_codec.getCodec();

  public synchronized static Internal_Reference_codec getCodec()
  {
    if ( me == null )
    {
      me = new Internal_Reference_codec();
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
    Internal_Reference_type retval = (Internal_Reference_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Internal_Reference_type();
      }

      retval.requester_reference = (Internal_Reference_Type_type)sm.implicit_tag(i_internal_reference_type_codec, retval.requester_reference, 128, 0, true, "requester_reference");
      retval.responder_reference = (Internal_Reference_Type_type)sm.implicit_tag(i_internal_reference_type_codec, retval.responder_reference, 128, 1, true, "responder_reference");
      sm.sequenceEnd();
    }

    return retval;
  }

}
