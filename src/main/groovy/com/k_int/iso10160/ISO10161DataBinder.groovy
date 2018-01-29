package com.k_int.iso10160;

import com.k_int.iso10161.ISO_10161_ILL_1.*;


public class ISO10161DataBinder {

  // Data binders are passed a map containing the data for the type to construct.
  // If the map is null, the function will return null
  // If the map contains properties, corresponding properties will be filled out
  // data binders return the type created
  
  /**
   * Accept a map of maps describiing an ILL APDU and convert to an actual DTO which can be encoded.
   * See src/test/groovy/com/k_int/iso10161/ProtocolTest.groovy for example messages.
   */
  public static ILL_APDU_type toISO(String type, Map message_data) {
    ILL_APDU_type result = new ILL_APDU_type();

    if ( message_data ) {
      switch ( type ) {
        case 'REQUEST':
          result.which = ILL_APDU_type.ill_request_var_CID;
          result.o = bindRequest(message_data);
          break;
        default:
          throw new RuntimeException('Unhandled message type: '+type);
          break;
      }
    }
    
    return result;
  }

  public static ILL_Request_type bindRequest(Map message_data) {
    ILL_Request_type result = new ILL_Request_type()

    if ( message_data.protocol_version_num ) result.protocol_version_num = new BigInteger(message_data.protocol_version_num);

    /* Mandatory Transaction_Id_type transaction_id */
    if ( message_data.transaction_id ) {
      result.transaction_id = new Transaction_Id_type();
      result.transaction_id.initial_requester_id = bindSystemIdType(message_data.transaction_id.initial_requester_id);
      result.transaction_id.transaction_group_qualifier = bindILLString(message_data.transaction_id.transaction_group_qualifier);
      result.transaction_id.transaction_qualifier = bindILLString(message_data.transaction_id.transaction_qualifier);
      result.transaction_id.sub_transaction_qualifier = bindILLString(message_data.transaction_id.sub_transaction_qualifier);
    }

    /* Mandatory Service_Date_Time_type service_date_time */
    result.service_date_time = bindServiceDateTime(message_data.service_date_time);

    /* Optional System_Id_type requester_id */
    result.requester_id = bindSystemId(message_data.requester_id);   

    /* Optional System_Id_type responder_id */
    result.responder_id = bindSystemId(message_data.responder_id);   

    /* Mandatory java.math.BigInteger transaction_type */
    /* Optional Delivery_Address_type delivery_address */
    /* Optional Delivery_Service_type delivery_service */
    /* Optional Delivery_Address_type billing_address */
    /* Mandatory java.util.Vector iLL_service_type */
    /* Optional EXTERNAL_type responder_specific_service */
    /* Mandatory Requester_Optional_Messages_Type_type requester_optional_messages */
    /* Optional Search_Type_type search_type */
    /* Optional java.util.Vector supply_medium_info_type */
    /* Mandatory java.math.BigInteger place_on_hold */
    /* Optional Client_Id_type client_id */
    /* Mandatory Item_Id_type item_id */
    /* Optional java.util.Vector supplemental_item_description */
    /* Optional Cost_Info_Type_type cost_info_type */
    /* Optional ILL_String_type copyright_compliance */
    /* Optional Third_Party_Info_Type_type third_party_info_type */
    /* Mandatory Boolean retry_flag */
    /* Mandatory Boolean forward_flag */
    /* Optional ILL_String_type requester_note */
    /* Optional ILL_String_type forward_note */

    return result;
  }

  public static System_Id_type bindSystemIdType(Map message_data) {
    System_Id_type result = null;
    if ( message_data) {
      result = new System_Id_type()
      result.person_or_institution_symbol = null;
      result.name_of_person_or_institution = null;
    }
    return result;
  }

  public static ILL_String_type bindILLString(String value) {
    def result = null;
    if ( value ) {
      result =  new ILL_String_type();
      result.which = ILL_String_type.generalstring_var_CID;
      result.o = value;
    }
    return result;
  }

  public static Service_Date_Time_type bindServiceDateTime(Map message_data) {
    Service_Date_Time_type result = null;
    if ( message_data ) {
      result = new Service_Date_Time_type();

      /* Mandatory date_time_of_this_service_inline35_type date_time_of_this_service */
      if ( message_data.date_time_of_this_service ) {
        result.date_time_of_this_service = new date_time_of_this_service_inline35_type();
        if ( message_data.date_time_of_this_service.date ) {
          result.date_time_of_this_service.date = message_data.date_time_of_this_service.date
        }
        if ( message_data.date_time_of_this_service.time ) {
          result.date_time_of_this_service.time = message_data.date_time_of_this_service.time;
        }
      }

      /* Optional member date_time_of_original_service_inline36_type date_time_of_original_service */
      if ( message_data.date_time_of_original_service_inline36_type ) {
        result.date_time_of_original_service = new date_time_of_original_service_inline36_type();
        if ( message_data.date_time_of_original_service.date ) {
          result.date_time_of_original_service.date = message_data.date_time_of_original_service.date
        }
        if ( message_data.date_time_of_original_service.time ) {
          result.date_time_of_original_service.time = message_data.date_time_of_original_service.time;
        }
      }
    }
    return result;
  }

  public static System_Id_type bindSystemId(Map message_data) {
    System_Id_type result = null;
    if ( message_data ) {
      result = new System_Id_type();
      /** Optional member Person_Or_Institution_Symbol_type person_or_institution_symbol */
      result.person_or_institution_symbol = bindPersonOrInstitutionSymbol(message_data.person_or_institution_symbol)

      /** Optional member Name_Of_Person_Or_Institution_type name_of_person_or_institution */
      result.name_of_person_or_institution = bindNameOfPesonOrInstitution(message_data.name_of_person_or_institution);
    }
    return result;
  }

  public static Person_Or_Institution_Symbol_type bindPersonOrInstitutionSymbol(Map message_data) {
    Person_Or_Institution_Symbol_type result = null;
    if ( message_data ) {
      result = new Person_Or_Institution_Symbol_type();
      if ( message_data.personSymbol ) {
        result.which = Person_Or_Institution_Symbol_type.person_symbol_CID;
        result.o = bindILLString(message_data.personSymbol);
      }
      else if ( message_data.institutionSymbol ) {
        result.which = Person_Or_Institution_Symbol_type.institution_symbol_CID;
        result.o = bindILLString(message_data.institutionSymbol);
      }
    }
    return result;
  }

  public static Name_Of_Person_Or_Institution_type bindNameOfPesonOrInstitution(Map message_data) {
    Name_Of_Person_Or_Institution_type result = null;
    if ( message_data ) {
      result = new Name_Of_Person_Or_Institution_type();
      if ( message_data.personName ) {
        result.which = Name_Of_Person_Or_Institution_type.person_symbol_CID;
        result.o = bindILLString(message_data.personName)
      }
      else if ( message_data.institutionName ) {
        result.which = Name_Of_Person_Or_Institution_type.institution_symbol_CID
        result.o = bindILLString(message_data.institutionName);
      }
    }
    return result;
  }
  
}
