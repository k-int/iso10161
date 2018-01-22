package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Dissertation_Thesis_Details_type 
 *  @author Auto generated bu A2J
 */ 
public class Dissertation_Thesis_Details_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type granting_institution = null;
    /** Optional member */
    public ILL_String_type date_granted = null;


    public Dissertation_Thesis_Details_type(ILL_String_type granting_institution,
      ILL_String_type date_granted)
    {
        this.granting_institution=granting_institution;
        this.date_granted=date_granted;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("granting_institution"=granting_institution);
        sw.write("date_granted"=date_granted);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Dissertation_Thesis_Details_type() {}


}
