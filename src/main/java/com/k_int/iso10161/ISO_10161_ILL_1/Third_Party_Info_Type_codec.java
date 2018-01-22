package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Third_Party_Info_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Third_Party_Info_Type_codec.class);
  public static Third_Party_Info_Type_codec me = null;

  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();
  private Send_To_List_Type_codec i_send_to_list_type_codec = Send_To_List_Type_codec.getCodec();
  private Already_Tried_List_Type_codec i_already_tried_list_type_codec = Already_Tried_List_Type_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Third_Party_Info_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Third_Party_Info_Type_codec();
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
    Third_Party_Info_Type_type retval = (Third_Party_Info_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Third_Party_Info_Type_type();
      }

      retval.permission_to_forward = (Boolean)sm.implicit_tag(i_bool_codec, retval.permission_to_forward, 128, 0, false, "permission_to_forward");
      retval.permission_to_chain = (Boolean)sm.implicit_tag(i_bool_codec, retval.permission_to_chain, 128, 1, false, "permission_to_chain");
      retval.permission_to_partition = (Boolean)sm.implicit_tag(i_bool_codec, retval.permission_to_partition, 128, 2, false, "permission_to_partition");
      retval.permission_to_change_send_to_list = (Boolean)sm.implicit_tag(i_bool_codec, retval.permission_to_change_send_to_list, 128, 3, false, "permission_to_change_send_to_list");
      retval.initial_requester_address = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.initial_requester_address, 128, 4, true, "initial_requester_address");
      retval.preference = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.preference, 128, 5, false, "preference");
      retval.send_to_list = (java.util.Vector)sm.implicit_tag(i_send_to_list_type_codec, retval.send_to_list, 128, 6, true, "send_to_list");
      retval.already_tried_list = (java.util.Vector)sm.implicit_tag(i_already_tried_list_type_codec, retval.already_tried_list, 128, 7, true, "already_tried_list");
      sm.sequenceEnd();
    }

    return retval;
  }

}
