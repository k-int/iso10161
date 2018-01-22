package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : System_Address_type 
 *  @author Auto generated bu A2J
 */ 
public class System_Address_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type telecom_service_identifier = null;
    /** Optional member */
    public ILL_String_type telecom_service_address = null;


    public System_Address_type(ILL_String_type telecom_service_identifier,
      ILL_String_type telecom_service_address)
    {
        this.telecom_service_identifier=telecom_service_identifier;
        this.telecom_service_address=telecom_service_address;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("telecom_service_identifier"=telecom_service_identifier);
        sw.write("telecom_service_address"=telecom_service_address);
        sw.write("\n}\n");
        return sw.toString();
    }

    public System_Address_type() {}


}
