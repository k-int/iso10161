package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Dissertation_Thesis_type 
 *  @author Auto generated bu A2J
 */ 
public class Dissertation_Thesis_type implements Serializable 
{
    /** Optional member */
    public type_inline50_type type = null;
    /** Mandatory member */
    public Dissertation_Thesis_Details_type details = null;


    public Dissertation_Thesis_type(type_inline50_type type,
      Dissertation_Thesis_Details_type details)
    {
        this.type=type;
        this.details=details;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("type"=type);
        sw.write("details"=details);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Dissertation_Thesis_type() {}


}
