package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Forward_Notification_type 
 *  @author Auto generated bu A2J
 */ 
public class Forward_Notification_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger protocol_version_num = null;
    /** Mandatory member */
    public Transaction_Id_type transaction_id = null;
    /** Mandatory member */
    public Service_Date_Time_type service_date_time = null;
    /** Optional member */
    public System_Id_type requester_id = null;
    /** Mandatory member */
    public System_Id_type responder_id = null;
    /** Optional member */
    public System_Address_type responder_address = null;
    /** Mandatory member */
    public System_Id_type intermediary_id = null;
    /** Optional member */
    public ILL_String_type notification_note = null;
    /** Optional member */
    public java.util.Vector forward_notification_extensions = null;


    public Forward_Notification_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      System_Address_type responder_address,
      System_Id_type intermediary_id,
      ILL_String_type notification_note,
      java.util.Vector forward_notification_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.responder_address=responder_address;
        this.intermediary_id=intermediary_id;
        this.notification_note=notification_note;
        this.forward_notification_extensions=forward_notification_extensions;
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
        sw.write("responder_address"=responder_address);
        sw.write("intermediary_id"=intermediary_id);
        sw.write("notification_note"=notification_note);
        sw.write("forward_notification_extensions"=forward_notification_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Forward_Notification_type() {}


}
