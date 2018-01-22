package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : ILL_Request_type 
 *  @author Auto generated bu A2J
 */ 
public class ILL_Request_type implements Serializable 
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
    public java.math.BigInteger transaction_type = null;
    /** Optional member */
    public Delivery_Address_type delivery_address = null;
    /** Optional member */
    public Delivery_Service_type delivery_service = null;
    /** Optional member */
    public Delivery_Address_type billing_address = null;
    /** Mandatory member */
    public java.util.Vector iLL_service_type = null;
    /** Optional member */
    public EXTERNAL_type responder_specific_service = null;
    /** Mandatory member */
    public Requester_Optional_Messages_Type_type requester_optional_messages = null;
    /** Optional member */
    public Search_Type_type search_type = null;
    /** Optional member */
    public java.util.Vector supply_medium_info_type = null;
    /** Mandatory member */
    public java.math.BigInteger place_on_hold = null;
    /** Optional member */
    public Client_Id_type client_id = null;
    /** Mandatory member */
    public Item_Id_type item_id = null;
    /** Optional member */
    public java.util.Vector supplemental_item_description = null;
    /** Optional member */
    public Cost_Info_Type_type cost_info_type = null;
    /** Optional member */
    public ILL_String_type copyright_compliance = null;
    /** Optional member */
    public Third_Party_Info_Type_type third_party_info_type = null;
    /** Mandatory member */
    public Boolean retry_flag = null;
    /** Mandatory member */
    public Boolean forward_flag = null;
    /** Optional member */
    public ILL_String_type requester_note = null;
    /** Optional member */
    public ILL_String_type forward_note = null;
    /** Optional member */
    public java.util.Vector iLL_request_extensions = null;


    public ILL_Request_type(BigInteger protocol_version_num,
      Transaction_Id_type transaction_id,
      Service_Date_Time_type service_date_time,
      System_Id_type requester_id,
      System_Id_type responder_id,
      java.math.BigInteger transaction_type,
      Delivery_Address_type delivery_address,
      Delivery_Service_type delivery_service,
      Delivery_Address_type billing_address,
      java.util.Vector iLL_service_type,
      EXTERNAL_type responder_specific_service,
      Requester_Optional_Messages_Type_type requester_optional_messages,
      Search_Type_type search_type,
      java.util.Vector supply_medium_info_type,
      java.math.BigInteger place_on_hold,
      Client_Id_type client_id,
      Item_Id_type item_id,
      java.util.Vector supplemental_item_description,
      Cost_Info_Type_type cost_info_type,
      ILL_String_type copyright_compliance,
      Third_Party_Info_Type_type third_party_info_type,
      Boolean retry_flag,
      Boolean forward_flag,
      ILL_String_type requester_note,
      ILL_String_type forward_note,
      java.util.Vector iLL_request_extensions)
    {
        this.protocol_version_num=protocol_version_num;
        this.transaction_id=transaction_id;
        this.service_date_time=service_date_time;
        this.requester_id=requester_id;
        this.responder_id=responder_id;
        this.transaction_type=transaction_type;
        this.delivery_address=delivery_address;
        this.delivery_service=delivery_service;
        this.billing_address=billing_address;
        this.iLL_service_type=iLL_service_type;
        this.responder_specific_service=responder_specific_service;
        this.requester_optional_messages=requester_optional_messages;
        this.search_type=search_type;
        this.supply_medium_info_type=supply_medium_info_type;
        this.place_on_hold=place_on_hold;
        this.client_id=client_id;
        this.item_id=item_id;
        this.supplemental_item_description=supplemental_item_description;
        this.cost_info_type=cost_info_type;
        this.copyright_compliance=copyright_compliance;
        this.third_party_info_type=third_party_info_type;
        this.retry_flag=retry_flag;
        this.forward_flag=forward_flag;
        this.requester_note=requester_note;
        this.forward_note=forward_note;
        this.iLL_request_extensions=iLL_request_extensions;
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
        sw.write("transaction_type"=transaction_type);
        sw.write("delivery_address"=delivery_address);
        sw.write("delivery_service"=delivery_service);
        sw.write("billing_address"=billing_address);
        sw.write("iLL_service_type"=iLL_service_type);
        sw.write("responder_specific_service"=responder_specific_service);
        sw.write("requester_optional_messages"=requester_optional_messages);
        sw.write("search_type"=search_type);
        sw.write("supply_medium_info_type"=supply_medium_info_type);
        sw.write("place_on_hold"=place_on_hold);
        sw.write("client_id"=client_id);
        sw.write("item_id"=item_id);
        sw.write("supplemental_item_description"=supplemental_item_description);
        sw.write("cost_info_type"=cost_info_type);
        sw.write("copyright_compliance"=copyright_compliance);
        sw.write("third_party_info_type"=third_party_info_type);
        sw.write("retry_flag"=retry_flag);
        sw.write("forward_flag"=forward_flag);
        sw.write("requester_note"=requester_note);
        sw.write("forward_note"=forward_note);
        sw.write("iLL_request_extensions"=iLL_request_extensions);
        sw.write("\n}\n");
        return sw.toString();
    }

    public ILL_Request_type() {}


}
