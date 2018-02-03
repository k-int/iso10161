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

}
