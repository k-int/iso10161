package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Damaged_type 
 *  @author Auto generated bu A2J
 */ 
public class Damaged_type implements Serializable 
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
    public Damaged_Details_type damaged_details = null;
    /** Optional member */
    public ILL_String_type note = null;
    /** Optional member */
    public java.util.Vector damaged_extensions = null;


    public Damaged_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      Damaged_Details_type damaged_details,
      ILL_String_type note,
      java.util.Vector damaged_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.damaged_details=damaged_details;
        this.note=note;
        this.damaged_extensions=damaged_extensions;
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
        sw.write("damaged_details="+damaged_details);
        sw.write("note="+note);
        sw.write("damaged_extensions="+damaged_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Damaged_type() {}


}
