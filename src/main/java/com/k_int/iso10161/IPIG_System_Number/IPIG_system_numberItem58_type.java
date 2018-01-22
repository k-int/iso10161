package com.k_int.iso10161.IPIG_System_Number;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : IPIG_system_numberItem58_type 
 *  @author Auto generated bu A2J
 */ 
public class IPIG_system_numberItem58_type implements Serializable 
{
    /** Mandatory member */
    public type_inline59_type type = null;
    /** Optional member */
    public ILL_String_type database_ID = null;
    /** Mandatory member */
    public ILL_String_type number = null;


    public IPIG_system_numberItem58_type(type_inline59_type type,
      ILL_String_type database_ID,
      ILL_String_type number)
    {
        this.type=type;
        this.database_ID=database_ID;
        this.number=number;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("type="+type);
        sw.write("database_ID="+database_ID);
        sw.write("number="+number);
        sw.write("\n}\n");
        return sw.toString();
    }

    public IPIG_system_numberItem58_type() {}


}
