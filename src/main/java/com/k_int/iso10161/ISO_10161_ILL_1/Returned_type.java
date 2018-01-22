package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Returned_type 
 *  @author Auto generated bu A2J
 */ 
public class Returned_type implements Serializable 
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
    /** Optional member */
    public java.util.Vector supplemental_item_description = null;
    /** Mandatory member */
    public java.lang.String date_returned = null;
    /** Optional member */
    public ILL_String_type returned_via = null;
    /** Optional member */
    public Amount_type insured_for = null;
    /** Optional member */
    public ILL_String_type requester_note = null;
    /** Optional member */
    public java.util.Vector returned_extensions = null;


    public Returned_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      java.util.Vector supplemental_item_description,
      java.lang.String date_returned,
      ILL_String_type returned_via,
      Amount_type insured_for,
      ILL_String_type requester_note,
      java.util.Vector returned_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.supplemental_item_description=supplemental_item_description;
        this.date_returned=date_returned;
        this.returned_via=returned_via;
        this.insured_for=insured_for;
        this.requester_note=requester_note;
        this.returned_extensions=returned_extensions;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("protocol_version_num="+protocol_version_num);
        sw.write("transaction_id="+transaction_id);
        sw.write("service_date_time="+service_date_time);
        sw.write("requester_id="+requester_id);
        sw.write("responder_id="+responder_id);
        sw.write("supplemental_item_description="+supplemental_item_description);
        sw.write("date_returned="+date_returned);
        sw.write("returned_via="+returned_via);
        sw.write("insured_for="+insured_for);
        sw.write("requester_note="+requester_note);
        sw.write("returned_extensions="+returned_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Returned_type() {}


}
