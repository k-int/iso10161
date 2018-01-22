package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Transaction_Id_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Transaction_Id_codec.class);
  public static Transaction_Id_codec me = null;

  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Transaction_Id_codec getCodec()
  {
    if ( me == null )
    {
      me = new Transaction_Id_codec();
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
    Transaction_Id_type retval = (Transaction_Id_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Transaction_Id_type();
      }

      retval.initial_requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.initial_requester_id, 128, 0, true, "initial_requester_id");
      retval.transaction_group_qualifier = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.transaction_group_qualifier, 128, 1, false, "transaction_group_qualifier");
      retval.transaction_qualifier = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.transaction_qualifier, 128, 2, false, "transaction_qualifier");
      retval.sub_transaction_qualifier = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.sub_transaction_qualifier, 128, 3, true, "sub_transaction_qualifier");
      sm.sequenceEnd();
    }

    return retval;
  }

}
