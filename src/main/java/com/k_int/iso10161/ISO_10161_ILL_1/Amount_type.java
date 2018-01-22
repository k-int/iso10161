package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Amount_type 
 *  @author Auto generated bu A2J
 */ 
public class Amount_type implements Serializable 
{
    /** Optional member */
    public java.lang.String currency_code = null;
    /** Mandatory member */
    public java.lang.String monetary_value = null;


    public Amount_type(java.lang.String currency_code,
      java.lang.String monetary_value)
    {
        this.currency_code=currency_code;
        this.monetary_value=monetary_value;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("currency_code="+currency_code);
        sw.write("monetary_value="+monetary_value);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Amount_type() {}


}
