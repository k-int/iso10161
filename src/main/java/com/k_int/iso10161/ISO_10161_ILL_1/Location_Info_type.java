package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Location_Info_type 
 *  @author Auto generated bu A2J
 */ 
public class Location_Info_type implements Serializable 
{
    /** Mandatory member */
    public System_Id_type location_id = null;
    /** Optional member */
    public System_Address_type location_address = null;
    /** Optional member */
    public ILL_String_type location_note = null;


    public Location_Info_type(System_Id_type location_id,
      System_Address_type location_address,
      ILL_String_type location_note)
    {
        this.location_id=location_id;
        this.location_address=location_address;
        this.location_note=location_note;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("location_id="+location_id);
        sw.write("location_address="+location_address);
        sw.write("location_note="+location_note);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Location_Info_type() {}


}
