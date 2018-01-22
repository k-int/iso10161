package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Send_To_List_TypeItem34_type 
 *  @author Auto generated bu A2J
 */ 
public class Send_To_List_TypeItem34_type implements Serializable 
{
    /** Mandatory member */
    public System_Id_type system_id = null;
    /** Optional member */
    public ILL_String_type account_number = null;
    /** Optional member */
    public System_Address_type system_address = null;


    public Send_To_List_TypeItem34_type(System_Id_type system_id,
      ILL_String_type account_number,
      System_Address_type system_address)
    {
        this.system_id=system_id;
        this.account_number=account_number;
        this.system_address=system_address;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("system_id"=system_id);
        sw.write("account_number"=account_number);
        sw.write("system_address"=system_address);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Send_To_List_TypeItem34_type() {}


}
