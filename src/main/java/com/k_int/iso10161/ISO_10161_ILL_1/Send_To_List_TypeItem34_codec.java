package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Send_To_List_TypeItem34_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Send_To_List_TypeItem34_codec.class);
  public static Send_To_List_TypeItem34_codec me = null;

  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Account_Number_codec i_account_number_codec = Account_Number_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();

  public synchronized static Send_To_List_TypeItem34_codec getCodec()
  {
    if ( me == null )
    {
      me = new Send_To_List_TypeItem34_codec();
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
    Send_To_List_TypeItem34_type retval = (Send_To_List_TypeItem34_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Send_To_List_TypeItem34_type();
      }

      retval.system_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.system_id, 128, 0, false, "system_id");
      retval.account_number = (ILL_String_type)sm.explicit_tag(i_account_number_codec, retval.account_number, 128, 1, true, "account_number");
      retval.system_address = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.system_address, 128, 2, true, "system_address");
      sm.sequenceEnd();
    }

    return retval;
  }

}
