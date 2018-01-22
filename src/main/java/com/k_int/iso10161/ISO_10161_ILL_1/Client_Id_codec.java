package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Client_Id_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Client_Id_codec.class);
  public static Client_Id_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Client_Id_codec getCodec()
  {
    if ( me == null )
    {
      me = new Client_Id_codec();
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
    Client_Id_type retval = (Client_Id_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Client_Id_type();
      }

      retval.client_name = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.client_name, 128, 0, true, "client_name");
      retval.client_status = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.client_status, 128, 1, true, "client_status");
      retval.client_identifier = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.client_identifier, 128, 2, true, "client_identifier");
      sm.sequenceEnd();
    }

    return retval;
  }

}
