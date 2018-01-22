package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Units_Per_Medium_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Units_Per_Medium_Type_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger medium = null;
    /** Mandatory member */
    public BigInteger no_of_units = null;


    public Units_Per_Medium_Type_type(java.math.BigInteger medium,
      BigInteger no_of_units)
    {
        this.medium=medium;
        this.no_of_units=no_of_units;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("medium="+medium);
        sw.write("no_of_units="+no_of_units);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Units_Per_Medium_Type_type() {}


}
