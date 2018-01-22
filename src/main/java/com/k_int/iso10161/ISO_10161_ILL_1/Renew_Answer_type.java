package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Renew_Answer_type 
 *  @author Auto generated bu A2J
 */ 
public class Renew_Answer_type implements Serializable 
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
    public Boolean answer = null;
    /** Optional member */
    public Date_Due_type date_due = null;
    /** Optional member */
    public ILL_String_type responder_note = null;
    /** Optional member */
    public java.util.Vector renew_answer_extensions = null;


    public Renew_Answer_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      Boolean answer,
      Date_Due_type date_due,
      ILL_String_type responder_note,
      java.util.Vector renew_answer_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.answer=answer;
        this.date_due=date_due;
        this.responder_note=responder_note;
        this.renew_answer_extensions=renew_answer_extensions;
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
        sw.write("answer"=answer);
        sw.write("date_due"=date_due);
        sw.write("responder_note"=responder_note);
        sw.write("renew_answer_extensions"=renew_answer_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Renew_Answer_type() {}


}
