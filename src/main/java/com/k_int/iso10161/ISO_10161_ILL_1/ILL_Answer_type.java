package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : ILL_Answer_type 
 *  @author Auto generated bu A2J
 */ 
public class ILL_Answer_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger protocol_version_num = null;
    /** Mandatory member */
    public Transaction_Id_type transaction_id = null;
    /** Mandatory member */
    public Service_Date_Time_type service_date_time = null;
    /** Optional member */
    public System_Id_type requester_id = null;
    /** Optional member */
    public System_Id_type responder_id = null;
    /** Mandatory member */
    public java.math.BigInteger transaction_results = null;
    /** Optional member */
    public results_explanation_inline5_type results_explanation = null;
    /** Optional member */
    public EXTERNAL_type responder_specific_results = null;
    /** Optional member */
    public java.util.Vector supplemental_item_description = null;
    /** Optional member */
    public java.util.Vector send_to_list = null;
    /** Optional member */
    public java.util.Vector already_tried_list = null;
    /** Optional member */
    public Responder_Optional_Messages_Type_type responder_optional_messages = null;
    /** Optional member */
    public ILL_String_type responder_note = null;
    /** Optional member */
    public java.util.Vector ill_answer_extensions = null;


    public ILL_Answer_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      java.math.BigInteger transaction_results,
      results_explanation_inline5_type results_explanation,
      EXTERNAL_type responder_specific_results,
      java.util.Vector supplemental_item_description,
      java.util.Vector send_to_list,
      java.util.Vector already_tried_list,
      Responder_Optional_Messages_Type_type responder_optional_messages,
      ILL_String_type responder_note,
      java.util.Vector ill_answer_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.transaction_results=transaction_results;
        this.results_explanation=results_explanation;
        this.responder_specific_results=responder_specific_results;
        this.supplemental_item_description=supplemental_item_description;
        this.send_to_list=send_to_list;
        this.already_tried_list=already_tried_list;
        this.responder_optional_messages=responder_optional_messages;
        this.responder_note=responder_note;
        this.ill_answer_extensions=ill_answer_extensions;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("protocol_version_num"=protocol_version_num);
        sw.write("transaction_id"=transaction_id);
        sw.write("service_date_time"=service_date_time);
        sw.write("requester_id"=requester_id);
        sw.write("responder_id"=responder_id);
        sw.write("transaction_results"=transaction_results);
        sw.write("results_explanation"=results_explanation);
        sw.write("responder_specific_results"=responder_specific_results);
        sw.write("supplemental_item_description"=supplemental_item_description);
        sw.write("send_to_list"=send_to_list);
        sw.write("already_tried_list"=already_tried_list);
        sw.write("responder_optional_messages"=responder_optional_messages);
        sw.write("responder_note"=responder_note);
        sw.write("ill_answer_extensions"=ill_answer_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public ILL_Answer_type() {}


}
