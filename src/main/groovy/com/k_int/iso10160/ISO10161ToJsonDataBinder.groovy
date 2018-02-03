package com.k_int.iso10160;

import com.k_int.iso10161.ISO_10161_ILL_1.*;


public class ISO10161ToJsonDataBinder {

  /**
   * Accept an ILL APDU and convert to a JSON object which is a mirror of the JSON created by
   * ISO10161DataBinder
   * See src/test/groovy/com/k_int/iso10161/ProtocolTest.groovy for example messages.
   */
  public static Map toJson(ILL_APDU_type apdu) {
    Map result = new java.util.HashMap();

    switch ( apdu.which ) {
      case ILL_APDU_type.ill_request_var_CID:
        result = [ request : bindRequest((ILL_Request_type)(apdu.o)) ]
        break;
      default:
        throw new RuntimeException("Unhandled apdu which value ${apdu.which}");
    }

    return result;
  }

  public static Map bindRequest(ILL_Request_type request) {
    Map result = new java.util.HashMap();
    if ( request.protocol_version_num ) result['protocol_version_number']=request.protocol_version_num;
    if ( request.transaction_id ) result['transaction_id']=bindTransactionId(request.transaction_id);

    /* Mandatory member Service_Date_Time_type service_date_time */
    if ( request.service_date_time ) result['service_date_time'] = bindServiceDateTime(request.service_date_time);

    /* Optional member System_Id_type requester_id */
    if ( request.requester_id ) result['requester_id'] = bindSystemId(request.requester_id);

    /* Optional member System_Id_type responder_id */
    if ( request.responder_id ) result['responder_id'] = bindSystemId(request.responder_id);

    /* Mandatory member java.math.BigInteger transaction_type */
    if ( request.transaction_type ) result['transaction_type'] = request.transaction_type;

    /* Optional member Delivery_Address_type delivery_address */
    /* Optional member Delivery_Service_type delivery_service */
    /* Optional member Delivery_Address_type billing_address */
    /* Mandatory member java.util.Vector iLL_service_type */
    /* Optional member EXTERNAL_type responder_specific_service */
    /* Mandatory member Requester_Optional_Messages_Type_type requester_optional_messages */
    /* Optional member Search_Type_type search_type */
    /* Optional member java.util.Vector supply_medium_info_type */
    /* Mandatory member java.math.BigInteger place_on_hold */
    /* Optional member Client_Id_type client_id */
    /* Mandatory member Item_Id_type item_id */
    if ( request.item_id ) result.item_id = bindItemId(request.item_id);

    /* Optional member java.util.Vector supplemental_item_description */
    /* Optional member Cost_Info_Type_type cost_info_type */
    /* Optional member ILL_String_type copyright_compliance */
    /* Optional member Third_Party_Info_Type_type third_party_info_type */

    /* Mandatory member Boolean retry_flag */
    if ( request.retry_flag ) result.retry_flag = request.retry_flag;

    /* Mandatory member Boolean forward_flag */
    if ( request.forward_flag ) result.forward_flag = request.forward_flag;

    /* Optional member ILL_String_type requester_note */
    if ( request.requester_note ) result.requester_note = request.requester_note.o?.toString()

    /* Optional member ILL_String_type forward_note */
    if ( request.forward_note ) result.forward_note = request.forward_note.o?.toString()

    /* Optional member java.util.Vector iLL_request_extensions */

    
    result;
  }

  public static Map bindTransactionId(Transaction_Id_type transaction_id) {
    Map result = new java.util.HashMap();
    if ( transaction_id.initial_requester_id ) { result.system_id = bindSystemId(transaction_id.initial_requester_id) }
    if ( transaction_id.transaction_group_qualifier ) { result.transaction_group_qualifier = transaction_id.transaction_group_qualifier.o?.toString() }
    if ( transaction_id.transaction_qualifier ) { result.transaction_qualifier = transaction_id.transaction_qualifier.o?.toString() }
    if ( transaction_id.sub_transaction_qualifier ) { result.sub_transaction_qualifier = transaction_id.sub_transaction_qualifier.o?.toString() }
    result;
  }

  public static Map bindSystemId(System_Id_type system_id) {
    Map result = new java.util.HashMap();
    if ( system_id.person_or_institution_symbol ) result.person_or_institution_symbol = bindPersonOrInstitutionSymbol(system_id.person_or_institution_symbol);
    if ( system_id.name_of_person_or_institution ) result.name_of_person_or_institution = bindNameOfPersonOrInstitution(system_id.name_of_person_or_institution);
    result;
  }

  public static Map bindPersonOrInstitutionSymbol(Person_Or_Institution_Symbol_type person_or_institution_symbol) {
    Map result = new java.util.HashMap();
    switch ( person_or_institution_symbol.which ) {
      case Person_Or_Institution_Symbol_type.person_symbol_CID :
        result.person_symbol=((ILL_String_type)(person_or_institution_symbol.o)).o.toString();
        break;
      case Person_Or_Institution_Symbol_type.institution_symbol_CID :
        result.institution_symbol=((ILL_String_type)(person_or_institution_symbol.o)).o.toString();
        break;
    }
    result;
  }

  public static Map bindNameOfPersonOrInstitution(Name_Of_Person_Or_Institution_type name_of_person_or_institution) {
    Map result = new java.util.HashMap();
    switch ( name_of_person_or_institution.which ) {
      case Name_Of_Person_Or_Institution_type.name_of_person_CID:
        result.name_of_person = ((ILL_String_type)(name_of_person_or_institution.o)).o.toString();
        break;
      case Name_Of_Person_Or_Institution_type.name_of_institution_CID:
        result.name_of_institution = ((ILL_String_type)(name_of_person_or_institution.o)).o.toString();
        break;
    }
    result;
  }

  public static Map bindServiceDateTime(Service_Date_Time_type service_date_time) {
    Map result = new java.util.HashMap();
    result;
  }

  public static Map bindItemId(Item_Id_type item_id) {
    Map result = new java.util.HashMap();

    /* Optional BigInteger item_type */
    if ( item_id.item_type ) result.item_type = item_id.item_type;

    /* Optional java.math.BigInteger held_medium_type */
    if ( item_id.held_medium_type ) result.held_medium_type = item_id.held_medium_type

    /* Optional ILL_String_type call_number */
    if ( item_id.call_number ) result.call_number = item_id.call_number.o?.toString();

    /* Optional ILL_String_type author */
    if ( item_id.author ) result.author = item_id.author.o?.toString();

    /* Optional ILL_String_type title */
    if ( item_id.title ) result.title = item_id.title.o?.toString();

    /* Optional ILL_String_type sub_title */
    if ( item_id.sub_title ) result.sub_title = item_id.sub_title.o?.toString();

    /* Optional ILL_String_type sponsoring_body */
    if ( item_id.sponsoring_body ) result.sponsoring_body = item_id.sponsoring_body.o?.toString();

    /* Optional ILL_String_type place_of_publication */
    if ( item_id.place_of_publication ) result.place_of_publication = item_id.place_of_publication.o?.toString();

    /* Optional ILL_String_type publisher */
    if ( item_id.publisher ) result.publisher = item_id.publisher.o?.toString;

    /* Optional ILL_String_type series_title_number */
    if ( item_id.series_title_number ) result.series_title_number = item_id.series_title_number.o?.toString();

    /* Optional ILL_String_type volume_issue */
    if ( item_id.volume_issue ) result.volume_issue = item_id.volume_issue.o.toString();

    /* Optional ILL_String_type edition */
    if ( item_id.edition ) result.edition = item_id.edition.o.toString();

    /* Optional ILL_String_type publication_date */
    if ( item_id.publication_date ) result.publication_date = item_id.publication_date.o.toString();

    /* Optional ILL_String_type publication_date_of_component */
    if ( item_id.publication_date_of_component ) result.publication_date_of_component = item_id.publication_date_of_component.o?.toString();

    /* Optional ILL_String_type author_of_article */
    if ( item_id.author_of_article ) result.author_of_article = item_id.author_of_article.o?.toString();

    /* Optional ILL_String_type title_of_article */
    if ( item_id.title_of_article ) result.title_of_article = item_id.title_of_article.o?.toString();

    /* Optional ILL_String_type pagination */
    if ( item_id.pagination ) result.pagination = item_id.pagination.o.toString();

    /* Optional EXTERNAL_type national_bibliography_no */
    if ( item_id.national_bibliography_no ) result.national_bibliography_no=null;

    /* Optional ILL_String_type iSBN */
    if ( item_id.iSBN ) result.iSBN = item_id.iSBN.o?.toString();

    /* Optional ILL_String_type iSSN */
    if ( item_id.iSSN ) result.iSSN = item_id.iSSN.o?.toString();

    /* Optional EXTERNAL_type system_no */
    if ( item_id.system_no ) result.system_no = null;

    /* Optional ILL_String_type additional_no_letters */
    if ( item_id.additional_no_letters ) result.additional_no_letters = item_id.additional_no_letters.o?.toString();

    /* Optional member ILL_String_type verification_reference_source */
    if ( item_id.verification_reference_source ) result.verification_reference_source = item_id.verification_reference_source.o?.toString();

    result;
  }
}
