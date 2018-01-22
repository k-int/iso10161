package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Hold_Placed_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Hold_Placed_Results_type implements Serializable 
{
    /** Mandatory member */
    public java.lang.String estimated_date_available = null;
    /** Optional member */
    public java.math.BigInteger hold_placed_medium_type = null;
    /** Optional member */
    public java.util.Vector locations = null;


    public Hold_Placed_Results_type(java.lang.String estimated_date_available,
      java.math.BigInteger hold_placed_medium_type,
      java.util.Vector locations)
    {
        this.estimated_date_available=estimated_date_available;
        this.hold_placed_medium_type=hold_placed_medium_type;
        this.locations=locations;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("estimated_date_available="+estimated_date_available);
        sw.write("hold_placed_medium_type="+hold_placed_medium_type);
        sw.write("locations="+locations);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Hold_Placed_Results_type() {}


}
