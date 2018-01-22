package com.k_int.iso10161.ILL_APDU_Delivery_Info;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
/** A Java holder for the ASN type : APDU_Delivery_Info_type 
 *  @author Auto generated bu A2J
 */ 
public class APDU_Delivery_Info_type implements Serializable 
{
    /** Mandatory member */
    public java.util.Vector sender_info = null;
    /** Mandatory member */
    public java.util.Vector recipient_info = null;
    /** Optional member */
    public java.util.Vector transponder_info = null;


    public APDU_Delivery_Info_type(java.util.Vector sender_info,
      java.util.Vector recipient_info,
      java.util.Vector transponder_info)
    {
        this.sender_info=sender_info;
        this.recipient_info=recipient_info;
        this.transponder_info=transponder_info;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("sender_info"=sender_info);
        sw.write("recipient_info"=recipient_info);
        sw.write("transponder_info"=transponder_info);
        sw.write("\n}\n");
        return sw.toString();
    }

    public APDU_Delivery_Info_type() {}


}
