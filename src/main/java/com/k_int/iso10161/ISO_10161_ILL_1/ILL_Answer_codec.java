package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class ILL_Answer_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ILL_Answer_codec.class);
  public static ILL_Answer_codec me = null;

  private ill_answer_extensions_inline6_codec i_ill_answer_extensions_inline6_codec = ill_answer_extensions_inline6_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private results_explanation_inline5_codec i_results_explanation_inline5_codec = results_explanation_inline5_codec.getCodec();
  private Transaction_Id_codec i_transaction_id_codec = Transaction_Id_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Responder_Optional_Messages_Type_codec i_responder_optional_messages_type_codec = Responder_Optional_Messages_Type_codec.getCodec();
  private EXTERNAL_codec i_external_codec = EXTERNAL_codec.getCodec();
  private Already_Tried_List_Type_codec i_already_tried_list_type_codec = Already_Tried_List_Type_codec.getCodec();
  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private Supplemental_Item_Description_codec i_supplemental_item_description_codec = Supplemental_Item_Description_codec.getCodec();
  private Transaction_Results_codec i_transaction_results_codec = Transaction_Results_codec.getCodec();
  private Send_To_List_Type_codec i_send_to_list_type_codec = Send_To_List_Type_codec.getCodec();
  private Service_Date_Time_codec i_service_date_time_codec = Service_Date_Time_codec.getCodec();

  public synchronized static ILL_Answer_codec getCodec()
  {
    if ( me == null )
    {
      me = new ILL_Answer_codec();
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
    ILL_Answer_type retval = (ILL_Answer_type)type_instance;

    if ( sm.constructedBegin(64, 4) )
    {
      sm.sequenceBegin();

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new ILL_Answer_type();
      }

      retval.protocol_version_num = (BigInteger)sm.implicit_tag(i_integer_codec, retval.protocol_version_num, 128, 0, false, "protocol_version_num");
      retval.transaction_id = (Transaction_Id_type)sm.implicit_tag(i_transaction_id_codec, retval.transaction_id, 128, 1, false, "transaction_id");
      retval.service_date_time = (Service_Date_Time_type)sm.implicit_tag(i_service_date_time_codec, retval.service_date_time, 128, 2, false, "service_date_time");
      retval.requester_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.requester_id, 128, 3, true, "requester_id");
      retval.responder_id = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.responder_id, 128, 4, true, "responder_id");
      retval.transaction_results = (java.math.BigInteger)sm.implicit_tag(i_transaction_results_codec, retval.transaction_results, 128, 31, false, "transaction_results");
      retval.results_explanation = (results_explanation_inline5_type)sm.explicit_tag(i_results_explanation_inline5_codec, retval.results_explanation, 128, 32, true, "results_explanation");
      retval.responder_specific_results = (EXTERNAL_type)sm.explicit_tag(i_external_codec, retval.responder_specific_results, 128, 33, true, "responder_specific_results");
      retval.supplemental_item_description = (java.util.Vector)sm.implicit_tag(i_supplemental_item_description_codec, retval.supplemental_item_description, 128, 17, true, "supplemental_item_description");
      retval.send_to_list = (java.util.Vector)sm.implicit_tag(i_send_to_list_type_codec, retval.send_to_list, 128, 23, true, "send_to_list");
      retval.already_tried_list = (java.util.Vector)sm.implicit_tag(i_already_tried_list_type_codec, retval.already_tried_list, 128, 34, true, "already_tried_list");
      retval.responder_optional_messages = (Responder_Optional_Messages_Type_type)sm.implicit_tag(i_responder_optional_messages_type_codec, retval.responder_optional_messages, 128, 28, true, "responder_optional_messages");
      retval.responder_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.responder_note, 128, 46, true, "responder_note");
      retval.ill_answer_extensions = (java.util.Vector)sm.implicit_tag(i_ill_answer_extensions_inline6_codec, retval.ill_answer_extensions, 128, 49, true, "ill_answer_extensions");
      sm.constructedEnd();
      sm.sequenceEnd();
    }

    return retval;
  }

}
