package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Supply_Medium_Info_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Supply_Medium_Info_Type_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger supply_medium_type = null;
    /** Optional member */
    public ILL_String_type medium_characteristics = null;


    public Supply_Medium_Info_Type_type(java.math.BigInteger supply_medium_type,
      ILL_String_type medium_characteristics)
    {
        this.supply_medium_type=supply_medium_type;
        this.medium_characteristics=medium_characteristics;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("supply_medium_type="+supply_medium_type);
        sw.write("medium_characteristics="+medium_characteristics);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Supply_Medium_Info_Type_type() {}


}
