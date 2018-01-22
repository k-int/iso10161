package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Service_Date_Time_type 
 *  @author Auto generated bu A2J
 */ 
public class Service_Date_Time_type implements Serializable 
{
    /** Mandatory member */
    public date_time_of_this_service_inline35_type date_time_of_this_service = null;
    /** Optional member */
    public date_time_of_original_service_inline36_type date_time_of_original_service = null;


    public Service_Date_Time_type(date_time_of_this_service_inline35_type date_time_of_this_service,
      date_time_of_original_service_inline36_type date_time_of_original_service)
    {
        this.date_time_of_this_service=date_time_of_this_service;
        this.date_time_of_original_service=date_time_of_original_service;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("date_time_of_this_service"=date_time_of_this_service);
        sw.write("date_time_of_original_service"=date_time_of_original_service);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Service_Date_Time_type() {}


}
