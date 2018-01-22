package com.k_int.iso10161.ISO_DATA;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_codec;
import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_type;
public class Pm_Data_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Pm_Data_codec.class);
  public static Pm_Data_codec me = null;

  private OctetString_codec i_octetstring_codec = OctetString_codec.getCodec();
  private Requester_Optional_Messages_Type_codec i_requester_optional_messages_type_codec = Requester_Optional_Messages_Type_codec.getCodec();
  private GeneralString_codec i_generalstring_codec = GeneralString_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private history_list_inline60_codec i_history_list_inline60_codec = history_list_inline60_codec.getCodec();
  private Responder_Optional_Messages_Type_codec i_responder_optional_messages_type_codec = Responder_Optional_Messages_Type_codec.getCodec();
  private APDU_Delivery_Info_codec i_apdu_delivery_info_codec = APDU_Delivery_Info_codec.getCodec();

  public synchronized static Pm_Data_codec getCodec()
  {
    if ( me == null )
    {
      me = new Pm_Data_codec();
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
    Pm_Data_type retval = (Pm_Data_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Pm_Data_type();
      }

      retval.transactionId = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transactionId, 128, 2, false, "transactionId");
      retval.iso_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.iso_id, 128, 3, true, "iso_id");
      retval.delivery_info = (APDU_Delivery_Info_type)sm.explicit_tag(i_apdu_delivery_info_codec, retval.delivery_info, 128, 4, true, "delivery_info");
      retval.variables = (byte[])sm.implicit_tag(i_octetstring_codec, retval.variables, 128, 5, true, "variables");
      retval.requester_optional_msgs = (Requester_Optional_Messages_Type_type)sm.implicit_tag(i_requester_optional_messages_type_codec, retval.requester_optional_msgs, 128, 10, true, "requester_optional_msgs");
      retval.responder_optional_msgs = (Responder_Optional_Messages_Type_type)sm.implicit_tag(i_responder_optional_messages_type_codec, retval.responder_optional_msgs, 128, 11, true, "responder_optional_msgs");
      retval.current_partner = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.current_partner, 128, 12, true, "current_partner");
      retval.alias = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.alias, 128, 20, true, "alias");
      retval.initiator_of_mrs = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.initiator_of_mrs, 128, 13, true, "initiator_of_mrs");
      retval.mrServiceNote = (java.lang.String)sm.implicit_tag(i_generalstring_codec, retval.mrServiceNote, 128, 6, true, "mrServiceNote");
      retval.history_list = (java.util.Vector)sm.implicit_tag(i_history_list_inline60_codec, retval.history_list, 128, 14, true, "history_list");
      sm.sequenceEnd();
    }

    return retval;
  }

}
