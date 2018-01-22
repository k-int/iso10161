package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Transaction_Id_type 
 *  @author Auto generated bu A2J
 */ 
public class Transaction_Id_type implements Serializable 
{
    /** Optional member */
    public System_Id_type initial_requester_id = null;
    /** Mandatory member */
    public ILL_String_type transaction_group_qualifier = null;
    /** Mandatory member */
    public ILL_String_type transaction_qualifier = null;
    /** Optional member */
    public ILL_String_type sub_transaction_qualifier = null;


    public Transaction_Id_type(System_Id_type initial_requester_id,
      ILL_String_type transaction_group_qualifier,
      ILL_String_type transaction_qualifier,
      ILL_String_type sub_transaction_qualifier)
    {
        this.initial_requester_id=initial_requester_id;
        this.transaction_group_qualifier=transaction_group_qualifier;
        this.transaction_qualifier=transaction_qualifier;
        this.sub_transaction_qualifier=sub_transaction_qualifier;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("initial_requester_id"=initial_requester_id);
        sw.write("transaction_group_qualifier"=transaction_group_qualifier);
        sw.write("transaction_qualifier"=transaction_qualifier);
        sw.write("sub_transaction_qualifier"=sub_transaction_qualifier);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Transaction_Id_type() {}


}
