package com.k_int.iso10160;

import com.k_int.iso10161.ISO_10161_ILL_1.*;


public class ISO10161DataBinder {
  
  public ILL_APDU_type toISO(String type, Map message_data) {
    ILL_APDU_type result = new ILL_APDU_type();
    switch ( type ) {
      case 'REQUEST':
        result.which = ILL_APDU_type.ill_request_var_CID;
        result.o = bindRequest(message_data);
      default:
        throw new RuntimeException('Unhandled message type: '+type);
    }
    
    return result;
  }

  public ILL_Request_type bindRequest(Map message_data) {
    ILL_Request_type result = new ILL_Request_type()

    if ( message_data.protocol_version_num ) result.protocol_version_num = new BigInteger(message_data.protocol_version_num);
    if ( message_data.transaction_id ) {
      result.transaction_id = new Transaction_Id_type();
      result.transaction_id.initial_requester_id = bindSystemIdType(message_data.transaction_id.initial_requester_id);
      result.transaction_id.transaction_group_qualifier = bindILLString(message_data.transaction_id.transaction_group_qualifier);
      result.transaction_id.transaction_qualifier = bindILLString(message_data.transaction_id.transaction_qualifier);
      result.transaction_id.sub_transaction_qualifier = bindILLString(message_data.transaction_id.sub_transaction_qualifier);
    }

    return result;
  }

  public System_Id_type bindSystemIdType(Map message_data) {
    System_Id_type result = null;
    if ( message_data) {
      result = new System_Id_type()
      result.person_or_institution_symbol = null;
      result.name_of_person_or_institution = null;
    }
    return result;
  }

  public ILL_String_type bindILLString(String value) {
    def result = null;
    if ( value ) {
      result =  new ILL_String_type();
      result.which = ILL_String_type.generalstring_var_CID;
      result.o = value;
    }
    return result;
  }
  
}
