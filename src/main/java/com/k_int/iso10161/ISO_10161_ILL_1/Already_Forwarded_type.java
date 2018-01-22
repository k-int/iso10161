package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Already_Forwarded_type 
 *  @author Auto generated bu A2J
 */ 
public class Already_Forwarded_type implements Serializable 
{
    /** Mandatory member */
    public System_Id_type responder_id = null;
    /** Optional member */
    public System_Address_type responder_address = null;


    public Already_Forwarded_type(System_Id_type responder_id,
      System_Address_type responder_address)
    {
        this.responder_id=responder_id;
        this.responder_address=responder_address;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("responder_id"=responder_id);
        sw.write("responder_address"=responder_address);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Already_Forwarded_type() {}


}
