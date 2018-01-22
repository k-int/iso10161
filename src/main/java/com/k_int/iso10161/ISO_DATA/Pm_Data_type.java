package com.k_int.iso10161.ISO_DATA;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_type;
/** A Java holder for the ASN type : Pm_Data_type 
 *  @author Auto generated bu A2J
 */ 
public class Pm_Data_type implements Serializable 
{
    /** Mandatory member */
    public Transaction_Id_type transactionId = null;
    /** Optional member */
    public System_Id_type iso_id = null;
    /** Optional member */
    public APDU_Delivery_Info_type delivery_info = null;
    /** Optional member */
    public byte[] variables = null;
    /** Optional member */
    public Requester_Optional_Messages_Type_type requester_optional_msgs = null;
    /** Optional member */
    public Responder_Optional_Messages_Type_type responder_optional_msgs = null;
    /** Optional member */
    public System_Id_type current_partner = null;
    /** Optional member */
    public System_Id_type alias = null;
    /** Optional member */
    public System_Id_type initiator_of_mrs = null;
    /** Optional member */
    public java.lang.String mrServiceNote = null;
    /** Optional member */
    public java.util.Vector history_list = null;


    public Pm_Data_type(Transaction_Id_type transactionId,
      System_Id_type iso_id,
      APDU_Delivery_Info_type delivery_info,
      byte[] variables,
      Requester_Optional_Messages_Type_type requester_optional_msgs,
      Responder_Optional_Messages_Type_type responder_optional_msgs,
      System_Id_type current_partner,
      System_Id_type alias,
      System_Id_type initiator_of_mrs,
      java.lang.String mrServiceNote,
      java.util.Vector history_list)
    {
        this.transactionId=transactionId;
        this.iso_id=iso_id;
        this.delivery_info=delivery_info;
        this.variables=variables;
        this.requester_optional_msgs=requester_optional_msgs;
        this.responder_optional_msgs=responder_optional_msgs;
        this.current_partner=current_partner;
        this.alias=alias;
        this.initiator_of_mrs=initiator_of_mrs;
        this.mrServiceNote=mrServiceNote;
        this.history_list=history_list;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("transactionId"=transactionId);
        sw.write("iso_id"=iso_id);
        sw.write("delivery_info"=delivery_info);
        sw.write("variables"=variables);
        sw.write("requester_optional_msgs"=requester_optional_msgs);
        sw.write("responder_optional_msgs"=responder_optional_msgs);
        sw.write("current_partner"=current_partner);
        sw.write("alias"=alias);
        sw.write("initiator_of_mrs"=initiator_of_mrs);
        sw.write("mrServiceNote"=mrServiceNote);
        sw.write("history_list"=history_list);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Pm_Data_type() {}


}
