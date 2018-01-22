package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : deposit_account_inline54_type 
 *  @author Auto generated bu A2J
 */ 
public class deposit_account_inline54_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type account_name = null;
    /** Mandatory member */
    public ILL_String_type account_number = null;


    public deposit_account_inline54_type(ILL_String_type account_name,
      ILL_String_type account_number)
    {
        this.account_name=account_name;
        this.account_number=account_number;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("account_name="+account_name);
        sw.write("account_number="+account_number);
        sw.write("\n}\n");
        return sw.toString();
    }

    public deposit_account_inline54_type() {}


}
