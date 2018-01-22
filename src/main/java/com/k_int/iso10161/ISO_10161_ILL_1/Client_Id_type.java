package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Client_Id_type 
 *  @author Auto generated bu A2J
 */ 
public class Client_Id_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type client_name = null;
    /** Optional member */
    public ILL_String_type client_status = null;
    /** Optional member */
    public ILL_String_type client_identifier = null;


    public Client_Id_type(ILL_String_type client_name,
      ILL_String_type client_status,
      ILL_String_type client_identifier)
    {
        this.client_name=client_name;
        this.client_status=client_status;
        this.client_identifier=client_identifier;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("client_name"=client_name);
        sw.write("client_status"=client_status);
        sw.write("client_identifier"=client_identifier);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Client_Id_type() {}


}
