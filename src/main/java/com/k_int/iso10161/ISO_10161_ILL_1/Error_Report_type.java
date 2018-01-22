package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Error_Report_type 
 *  @author Auto generated bu A2J
 */ 
public class Error_Report_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type correlation_information = null;
    /** Mandatory member */
    public java.math.BigInteger report_source = null;
    /** Optional member */
    public User_Error_Report_type user_error_report = null;
    /** Optional member */
    public Provider_Error_Report_type provider_error_report = null;


    public Error_Report_type(ILL_String_type correlation_information,
      java.math.BigInteger report_source,
      User_Error_Report_type user_error_report,
      Provider_Error_Report_type provider_error_report)
    {
        this.correlation_information=correlation_information;
        this.report_source=report_source;
        this.user_error_report=user_error_report;
        this.provider_error_report=provider_error_report;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("correlation_information="+correlation_information);
        sw.write("report_source="+report_source);
        sw.write("user_error_report="+user_error_report);
        sw.write("provider_error_report="+provider_error_report);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Error_Report_type() {}


}
