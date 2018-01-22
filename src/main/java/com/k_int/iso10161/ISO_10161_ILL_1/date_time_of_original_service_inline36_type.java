package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : date_time_of_original_service_inline36_type 
 *  @author Auto generated bu A2J
 */ 
public class date_time_of_original_service_inline36_type implements Serializable 
{
    /** Mandatory member */
    public java.lang.String date = null;
    /** Optional member */
    public java.lang.String time = null;


    public date_time_of_original_service_inline36_type(java.lang.String date,
      java.lang.String time)
    {
        this.date=date;
        this.time=time;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("date="+date);
        sw.write("time="+time);
        sw.write("\n}\n");
        return sw.toString();
    }

    public date_time_of_original_service_inline36_type() {}


}
