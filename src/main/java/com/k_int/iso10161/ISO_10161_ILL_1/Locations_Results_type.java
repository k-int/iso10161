package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Locations_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Locations_Results_type implements Serializable 
{
    /** Optional member */
    public java.math.BigInteger reason_locs_provided = null;
    /** Mandatory member */
    public java.util.Vector locations = null;


    public Locations_Results_type(java.math.BigInteger reason_locs_provided,
      java.util.Vector locations)
    {
        this.reason_locs_provided=reason_locs_provided;
        this.locations=locations;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reason_locs_provided"=reason_locs_provided);
        sw.write("locations"=locations);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Locations_Results_type() {}


}
