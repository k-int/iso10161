package com.k_int.iso10161.ILL_Supplemental_Client_Info;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Postal_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Amount_type;
/** A Java holder for the ASN type : ClientInfoData_type 
 *  @author Auto generated bu A2J
 */ 
public class ClientInfoData_type implements Serializable 
{
    /** Mandatory member */
    public ClientInfoType_type infoType = null;
    /** Mandatory member */
    public java.util.Vector infoContent = null;


    public ClientInfoData_type(ClientInfoType_type infoType,
      java.util.Vector infoContent)
    {
        this.infoType=infoType;
        this.infoContent=infoContent;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("infoType="+infoType);
        sw.write("infoContent="+infoContent);
        sw.write("\n}\n");
        return sw.toString();
    }

    public ClientInfoData_type() {}


}
