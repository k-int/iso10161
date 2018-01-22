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
/** A Java holder for the ASN type : SAGE_DATA_type 
 *  @author Auto generated bu A2J
 */ 
public class SAGE_DATA_type implements Serializable 
{
    /** Optional member */
    public BigInteger illNumber = null;
    /** Optional member */
    public BigInteger status = null;
    /** Optional member */
    public BigInteger problemStatus = null;
    /** Optional member */
    public byte[] iso_data = null;


    public SAGE_DATA_type(BigInteger illNumber,
      BigInteger status,
      BigInteger problemStatus,
      byte[] iso_data)
    {
        this.illNumber=illNumber;
        this.status=status;
        this.problemStatus=problemStatus;
        this.iso_data=iso_data;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("illNumber="+illNumber);
        sw.write("status="+status);
        sw.write("problemStatus="+problemStatus);
        sw.write("iso_data="+iso_data);
        sw.write("\n}\n");
        return sw.toString();
    }

    public SAGE_DATA_type() {}


}
