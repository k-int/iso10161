package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Unfilled_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Unfilled_Results_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger reason_unfilled = null;
    /** Optional member */
    public java.util.Vector locations = null;


    public Unfilled_Results_type(java.math.BigInteger reason_unfilled,
      java.util.Vector locations)
    {
        this.reason_unfilled=reason_unfilled;
        this.locations=locations;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reason_unfilled"=reason_unfilled);
        sw.write("locations"=locations);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Unfilled_Results_type() {}


}
