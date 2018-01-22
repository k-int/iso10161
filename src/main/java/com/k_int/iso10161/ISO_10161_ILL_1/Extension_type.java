package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Extension_type 
 *  @author Auto generated bu A2J
 */ 
public class Extension_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger identifier = null;
    /** Mandatory member */
    public Boolean critical = null;
    /** Mandatory member */
    public Object item = null;


    public Extension_type(BigInteger identifier,
      Boolean critical,
      Object item)
    {
        this.identifier=identifier;
        this.critical=critical;
        this.item=item;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("identifier="+identifier);
        sw.write("critical="+critical);
        sw.write("item="+item);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Extension_type() {}


}
