package com.k_int.iso10161.ISO_DATA;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_type;
/** A Java holder for the ASN type : ISO_DATA_type 
 *  @author Auto generated bu A2J
 */ 
public class ISO_DATA_type implements Serializable 
{
    /** Mandatory member */
    public byte[] flags = null;
    /** Optional member */
    public Pm_Data_type requester = null;
    /** Optional member */
    public Pm_Data_type responder = null;
    /** Optional member */
    public byte[] ppartner = null;


    public ISO_DATA_type(byte[] flags,
      Pm_Data_type requester,
      Pm_Data_type responder,
      byte[] ppartner)
    {
        this.flags=flags;
        this.requester=requester;
        this.responder=responder;
        this.ppartner=ppartner;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("flags"=flags);
        sw.write("requester"=requester);
        sw.write("responder"=responder);
        sw.write("ppartner"=ppartner);
        sw.write("\n}\n");
        return sw.toString();
    }

    public ISO_DATA_type() {}


}
