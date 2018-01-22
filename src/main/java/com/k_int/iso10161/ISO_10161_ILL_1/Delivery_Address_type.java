package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Delivery_Address_type 
 *  @author Auto generated bu A2J
 */ 
public class Delivery_Address_type implements Serializable 
{
    /** Optional member */
    public Postal_Address_type postal_address = null;
    /** Optional member */
    public System_Address_type electronic_address = null;


    public Delivery_Address_type(Postal_Address_type postal_address,
      System_Address_type electronic_address)
    {
        this.postal_address=postal_address;
        this.electronic_address=electronic_address;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("postal_address="+postal_address);
        sw.write("electronic_address="+electronic_address);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Delivery_Address_type() {}


}
