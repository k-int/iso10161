package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : bank_electronic_payment_inline55_type 
 *  @author Auto generated bu A2J
 */ 
public class bank_electronic_payment_inline55_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type bank_name = null;
    /** Mandatory member */
    public ILL_String_type bank_address = null;
    /** Mandatory member */
    public ILL_String_type routing_number = null;
    /** Mandatory member */
    public ILL_String_type account_number = null;


    public bank_electronic_payment_inline55_type(ILL_String_type bank_name,
      ILL_String_type bank_address,
      ILL_String_type routing_number,
      ILL_String_type account_number)
    {
        this.bank_name=bank_name;
        this.bank_address=bank_address;
        this.routing_number=routing_number;
        this.account_number=account_number;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("bank_name"=bank_name);
        sw.write("bank_address"=bank_address);
        sw.write("routing_number"=routing_number);
        sw.write("account_number"=account_number);
        sw.write("\n}\n");
        return sw.toString();
    }

    public bank_electronic_payment_inline55_type() {}


}
