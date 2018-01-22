package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Rights_Information_type 
 *  @author Auto generated bu A2J
 */ 
public class Rights_Information_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type rights_information_country = null;
    /** Mandatory member */
    public ILL_String_type rights_information_type = null;
    /** Mandatory member */
    public ILL_String_type rights_information_value = null;


    public Rights_Information_type(ILL_String_type rights_information_country,
      ILL_String_type rights_information_type,
      ILL_String_type rights_information_value)
    {
        this.rights_information_country=rights_information_country;
        this.rights_information_type=rights_information_type;
        this.rights_information_value=rights_information_value;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("rights_information_country"=rights_information_country);
        sw.write("rights_information_type"=rights_information_type);
        sw.write("rights_information_value"=rights_information_value);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Rights_Information_type() {}


}
