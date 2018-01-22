package com.k_int.iso10161.IPIG_System_Number;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class IPIG_system_numberItem58_codec extends base_codec
{
  private static Log log = LogFactory.getLog(IPIG_system_numberItem58_codec.class);
  public static IPIG_system_numberItem58_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private type_inline59_codec i_type_inline59_codec = type_inline59_codec.getCodec();

  public synchronized static IPIG_system_numberItem58_codec getCodec()
  {
    if ( me == null )
    {
      me = new IPIG_system_numberItem58_codec();
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
    IPIG_system_numberItem58_type retval = (IPIG_system_numberItem58_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new IPIG_system_numberItem58_type();
      }

      retval.type = (type_inline59_type)i_type_inline59_codec.serialize(sm, retval.type,false, "type");
      retval.database_ID = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.database_ID, 128, 3, true, "database_ID");
      retval.number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.number, 128, 4, false, "number");
      sm.sequenceEnd();
    }

    return retval;
  }

}
