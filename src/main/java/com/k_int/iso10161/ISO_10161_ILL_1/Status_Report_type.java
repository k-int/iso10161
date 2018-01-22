package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Status_Report_type 
 *  @author Auto generated bu A2J
 */ 
public class Status_Report_type implements Serializable 
{
    /** Mandatory member */
    public History_Report_type user_status_report = null;
    /** Mandatory member */
    public java.math.BigInteger provider_status_report = null;


    public Status_Report_type(History_Report_type user_status_report,
      java.math.BigInteger provider_status_report)
    {
        this.user_status_report=user_status_report;
        this.provider_status_report=provider_status_report;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("user_status_report="+user_status_report);
        sw.write("provider_status_report="+provider_status_report);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Status_Report_type() {}


}
