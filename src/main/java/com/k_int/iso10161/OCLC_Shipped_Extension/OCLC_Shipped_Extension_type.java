package com.k_int.iso10161.OCLC_Shipped_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : OCLC_Shipped_Extension_type 
 *  @author Auto generated bu A2J
 */ 
public class OCLC_Shipped_Extension_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type paymentMethod = null;


    public OCLC_Shipped_Extension_type(ILL_String_type paymentMethod)
    {
        this.paymentMethod=paymentMethod;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("paymentMethod"=paymentMethod);
        sw.write("\n}\n");
        return sw.toString();
    }

    public OCLC_Shipped_Extension_type() {}


}
