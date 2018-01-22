package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Shipped_type 
 *  @author Auto generated bu A2J
 */ 
public class Shipped_type implements Serializable 
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
    public System_Address_type responder_address = null;
    /** Optional member */
    public System_Id_type intermediary_id = null;
    /** Optional member */
    public System_Id_type supplier_id = null;
    /** Optional member */
    public Client_Id_type client_id = null;
    /** Mandatory member */
    public java.math.BigInteger transaction_type = null;
    /** Optional member */
    public java.util.Vector supplemental_item_description = null;
    /** Mandatory member */
    public java.math.BigInteger shipped_service_type = null;
    /** Optional member */
    public Responder_Optional_Messages_Type_type responder_optional_messages = null;
    /** Mandatory member */
    public Supply_Details_type supply_details = null;
    /** Optional member */
    public Postal_Address_type return_to_address = null;
    /** Optional member */
    public ILL_String_type responder_note = null;
    /** Optional member */
    public java.util.Vector shipped_extensions = null;


    public Shipped_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      System_Address_type responder_address,
      System_Id_type intermediary_id,
      System_Id_type supplier_id,
      Client_Id_type client_id,
      java.math.BigInteger transaction_type,
      java.util.Vector supplemental_item_description,
      java.math.BigInteger shipped_service_type,
      Responder_Optional_Messages_Type_type responder_optional_messages,
      Supply_Details_type supply_details,
      Postal_Address_type return_to_address,
      ILL_String_type responder_note,
      java.util.Vector shipped_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.responder_address=responder_address;
        this.intermediary_id=intermediary_id;
        this.supplier_id=supplier_id;
        this.client_id=client_id;
        this.transaction_type=transaction_type;
        this.supplemental_item_description=supplemental_item_description;
        this.shipped_service_type=shipped_service_type;
        this.responder_optional_messages=responder_optional_messages;
        this.supply_details=supply_details;
        this.return_to_address=return_to_address;
        this.responder_note=responder_note;
        this.shipped_extensions=shipped_extensions;
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
        sw.write("supplier_id"=supplier_id);
        sw.write("client_id"=client_id);
        sw.write("transaction_type"=transaction_type);
        sw.write("supplemental_item_description"=supplemental_item_description);
        sw.write("shipped_service_type"=shipped_service_type);
        sw.write("responder_optional_messages"=responder_optional_messages);
        sw.write("supply_details"=supply_details);
        sw.write("return_to_address"=return_to_address);
        sw.write("responder_note"=responder_note);
        sw.write("shipped_extensions"=shipped_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Shipped_type() {}


}
