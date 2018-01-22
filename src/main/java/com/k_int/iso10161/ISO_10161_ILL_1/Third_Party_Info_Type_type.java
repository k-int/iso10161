package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Third_Party_Info_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Third_Party_Info_Type_type implements Serializable 
{
    /** Mandatory member */
    public Boolean permission_to_forward = null;
    /** Mandatory member */
    public Boolean permission_to_chain = null;
    /** Mandatory member */
    public Boolean permission_to_partition = null;
    /** Mandatory member */
    public Boolean permission_to_change_send_to_list = null;
    /** Optional member */
    public System_Address_type initial_requester_address = null;
    /** Mandatory member */
    public BigInteger preference = null;
    /** Optional member */
    public java.util.Vector send_to_list = null;
    /** Optional member */
    public java.util.Vector already_tried_list = null;


    public Third_Party_Info_Type_type(Boolean permission_to_forward,
      Boolean permission_to_chain,
      Boolean permission_to_partition,
      Boolean permission_to_change_send_to_list,
      System_Address_type initial_requester_address,
      BigInteger preference,
      java.util.Vector send_to_list,
      java.util.Vector already_tried_list)
    {
        this.permission_to_forward=permission_to_forward;
        this.permission_to_chain=permission_to_chain;
        this.permission_to_partition=permission_to_partition;
        this.permission_to_change_send_to_list=permission_to_change_send_to_list;
        this.initial_requester_address=initial_requester_address;
        this.preference=preference;
        this.send_to_list=send_to_list;
        this.already_tried_list=already_tried_list;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("permission_to_forward"=permission_to_forward);
        sw.write("permission_to_chain"=permission_to_chain);
        sw.write("permission_to_partition"=permission_to_partition);
        sw.write("permission_to_change_send_to_list"=permission_to_change_send_to_list);
        sw.write("initial_requester_address"=initial_requester_address);
        sw.write("preference"=preference);
        sw.write("send_to_list"=send_to_list);
        sw.write("already_tried_list"=already_tried_list);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Third_Party_Info_Type_type() {}


}
