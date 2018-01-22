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
/** A Java holder for the ASN type : History_type 
 *  @author Auto generated bu A2J
 */ 
public class History_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger service_type = null;
    /** Mandatory member */
    public java.lang.String datetime = null;
    /** Mandatory member */
    public System_Id_type initiator = null;
    /** Optional member */
    public java.lang.String note = null;


    public History_type(BigInteger service_type,
      java.lang.String datetime,
      System_Id_type initiator,
      java.lang.String note)
    {
        this.service_type=service_type;
        this.datetime=datetime;
        this.initiator=initiator;
        this.note=note;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("service_type"=service_type);
        sw.write("datetime"=datetime);
        sw.write("initiator"=initiator);
        sw.write("note"=note);
        sw.write("\n}\n");
        return sw.toString();
    }

    public History_type() {}


}
