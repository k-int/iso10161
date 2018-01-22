package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Date_Due_type 
 *  @author Auto generated bu A2J
 */ 
public class Date_Due_type implements Serializable 
{
    /** Mandatory member */
    public java.lang.String date_due_field = null;
    /** Mandatory member */
    public Boolean renewable = null;


    public Date_Due_type(java.lang.String date_due_field,
      Boolean renewable)
    {
        this.date_due_field=date_due_field;
        this.renewable=renewable;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("date_due_field"=date_due_field);
        sw.write("renewable"=renewable);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Date_Due_type() {}


}
