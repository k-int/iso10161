package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Retry_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Retry_Results_type implements Serializable 
{
    /** Optional member */
    public BigInteger reason_not_available = null;
    /** Optional member */
    public java.lang.String retry_date = null;
    /** Optional member */
    public java.util.Vector locations = null;


    public Retry_Results_type(BigInteger reason_not_available,
      java.lang.String retry_date,
      java.util.Vector locations)
    {
        this.reason_not_available=reason_not_available;
        this.retry_date=retry_date;
        this.locations=locations;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reason_not_available="+reason_not_available);
        sw.write("retry_date="+retry_date);
        sw.write("locations="+locations);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Retry_Results_type() {}


}
