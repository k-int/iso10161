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
  public static ILL_APDU_type toISO(Map message_data) {
    ILL_APDU_type result = new ILL_APDU_type();

    if ( message_data.request ) {
      result.which = ILL_APDU_type.ill_request_var_CID;
      result.o = bindRequest(message_data.request);
    }
    else {
      throw new RuntimeException('Unhandled root message type: '+message_data.keySet());
    }
    
    return result;
  }

  public static ILL_Request_type bindRequest(Map message_data) {
    ILL_Request_type result = new ILL_Request_type()

    if ( message_data.protocol_version_num ) result.protocol_version_num = bindBigInteger(message_data.protocol_version_num);

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
    result.transaction_type = bindBigInteger(message_data.transaction_type);

    /* Optional Delivery_Address_type delivery_address */
    /* Optional Delivery_Service_type delivery_service */
    /* Optional Delivery_Address_type billing_address */

    /* Mandatory java.util.Vector iLL_service_type */
    result.iLL_service_type = bindIllService(message_data.iLL_service_type);

    /* Optional EXTERNAL_type responder_specific_service */

    /* Mandatory Requester_Optional_Messages_Type_type requester_optional_messages */
    result.requester_optional_messages = bindRequesterOptionalMessages(message_data.requester_optional_messages);

    /* Optional Search_Type_type search_type */
    /* Optional java.util.Vector supply_medium_info_type */

    /* Mandatory java.math.BigInteger place_on_hold */
    result.place_on_hold = bindBigInteger(message_data.place_on_hold);

    /* Optional Client_Id_type client_id */

    /* Mandatory Item_Id_type item_id */
    result.item_id = bindItemId(message_data.item_id);

    /* Optional java.util.Vector supplemental_item_description */
    /* Optional Cost_Info_Type_type cost_info_type */
    /* Optional ILL_String_type copyright_compliance */
    /* Optional Third_Party_Info_Type_type third_party_info_type */

    /* Mandatory Boolean retry_flag */
    result.retry_flag = message_data.retry_flag;

    /* Mandatory Boolean forward_flag */
    result.forward_flag = message_data.forward_flag;

    /* Optional ILL_String_type requester_note */
    result.requester_note = bindILLString(message_data.requester_note);

    /* Optional ILL_String_type forward_note */
    result.forward_note = bindILLString(message_data.forward_note);

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
      if ( message_data.date_time_of_original_service ) {
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
  
  public static Item_Id_type bindItemId(Map message_data) {
    Item_Id_type result = null;

    if ( message_data ) {
      result = new Item_Id_type();
      /* Optional BigInteger item_type */
      result.item_type = bindBigInteger(message_data.item_type);

      /* Optional java.math.BigInteger held_medium_type */
      result.held_medium_type = bindBigInteger(message_data.held_medium_type);

      /* Optional ILL_String_type call_number */
      result.call_number = bindILLString(message_data.call_number);

      /* Optional ILL_String_type author */
      result.author = bindILLString(message_data.author);

      /* Optional ILL_String_type title */
      result.title = bindILLString(message_data.title);

      /* Optional ILL_String_type sub_title */
      result.sub_title = bindILLString(message_data.sub_title);

      /* Optional ILL_String_type sponsoring_body */
      result.sponsoring_body = bindILLString(message_data.sponsoring_body);

      /* Optional ILL_String_type place_of_publication */
      result.place_of_publication = bindILLString(message_data.place_of_publication);

      /* Optional ILL_String_type publisher */
      result.publisher = bindILLString(message_data.publisher);

      /* Optional ILL_String_type series_title_number */
      result.series_title_number = bindILLString(message_data.series_title_number);

      /* Optional ILL_String_type volume_issue */
      result.volume_issue = bindILLString(message_data.volume_issue);

      /* Optional ILL_String_type edition */
      result.edition = bindILLString(message_data.edition);

      /* Optional ILL_String_type publication_date */
      result.publication_date = bindILLString(message_data.publication_date);

      /* Optional ILL_String_type publication_date_of_component */
      result.publication_date_of_component = bindILLString(message_data.publication_date_of_component);

      /* Optional ILL_String_type author_of_article */
      result.author_of_article = bindILLString(message_data.author_of_article);

      /* Optional ILL_String_type title_of_article */
      result.title_of_article = bindILLString(message_data.title_of_article);

      /* Optional ILL_String_type pagination */
      result.pagination = bindILLString(message_data.pagination);

      /* Optional EXTERNAL_type national_bibliography_no */

      /* Optional ILL_String_type iSBN */
      result.iSBN = bindILLString(message_data.iSBN);

      /* Optional ILL_String_type iSSN */
      result.iSSN = bindILLString(message_data.iSSN);

      /* Optional EXTERNAL_type system_no */

      /* Optional ILL_String_type additional_no_letters */
      result.additional_no_letters = bindILLString(message_data.additional_no_letters);

      /* Optional ILL_String_type verification_reference_source */
      result.verification_reference_source = bindILLString(message_data.verification_reference_source);
    }

    return result;
  }

  public static BigInteger bindBigInteger(Object value) {
    BigInteger result = null;
    if ( value ) {
      if ( value instanceof BigInteger ) {
        result = value;
      }
      else {
        result = new BigInteger(value);
      }
    }
    return result;
  }

  public static Vector bindIllService(List message_data) {
    Vector result = null;
    if ( message_data ) {
      result = new Vector();
      message_data.each { svc -> 
        switch ( svc ) {
          case 'loan':
            result.add(new BigInteger(1));
            break;
          case 'copy-non-returnable':
            result.add(new BigInteger(2));
            break;
          case 'locations':
            result.add(new BigInteger(3));
            break;
          case 'estimate':
            result.add(new BigInteger(4));
            break;
          case 'responder-specific':
            result.add(new BigInteger(5));
            break;
        }
      }
    }
    return result;
  }

  public static Requester_Optional_Messages_Type_type bindRequesterOptionalMessages(Map message_data) {
    Requester_Optional_Messages_Type_type result = null;
    if ( message_data ) {
      result = new Requester_Optional_Messages_Type_type();
      /* Mandatory Boolean can_send_RECEIVED */
      result.can_send_RECEIVED = bindBoolean(message_data.can_send_RECEIVED);

      /* Mandatory Boolean can_send_RETURNED */
      result.can_send_RETURNED = bindBoolean(message_data.can_send_RETURNED);

      /* Mandatory BigInteger requester_SHIPPED */
      result.requester_SHIPPED = bindBigInteger(message_data.requester_SHIPPED);

      /* Mandatory BigInteger requester_CHECKED_IN */
      result.requester_CHECKED_IN = bindBigInteger(message_data.requester_CHECKED_IN);
    }
    return result;
  }

  public static Boolean bindBoolean(Object value) {
    Boolean result = null;
    if ( value instanceof Boolean ) {
      result = (Boolean)value;
    }
    else {
      result = new Boolean(value);
    }
    return result;
  }
}
