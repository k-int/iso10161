package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Estimate_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Estimate_Results_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type cost_estimate = null;
    /** Optional member */
    public java.util.Vector locations = null;


    public Estimate_Results_type(ILL_String_type cost_estimate,
      java.util.Vector locations)
    {
        this.cost_estimate=cost_estimate;
        this.locations=locations;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("cost_estimate"=cost_estimate);
        sw.write("locations"=locations);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Estimate_Results_type() {}


}
