package com.k_int.iso10161.ILL_APDU_Delivery_Info;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
/** A Java holder for the ASN type : APDU_Delivery_Parameters_type 
 *  @author Auto generated bu A2J
 */ 
public class APDU_Delivery_Parameters_type implements Serializable 
{
    /** Mandatory member */
    public java.util.Vector encoding = null;
    /** Mandatory member */
    public System_Address_type transport = null;
    /** Optional member */
    public java.util.Vector aliases = null;


    public APDU_Delivery_Parameters_type(java.util.Vector encoding,
      System_Address_type transport,
      java.util.Vector aliases)
    {
        this.encoding=encoding;
        this.transport=transport;
        this.aliases=aliases;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("encoding"=encoding);
        sw.write("transport"=transport);
        sw.write("aliases"=aliases);
        sw.write("\n}\n");
        return sw.toString();
    }

    public APDU_Delivery_Parameters_type() {}


}
