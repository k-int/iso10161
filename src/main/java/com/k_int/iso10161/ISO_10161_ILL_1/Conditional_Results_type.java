package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Conditional_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Conditional_Results_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger conditions = null;
    /** Optional member */
    public java.lang.String date_for_reply = null;
    /** Optional member */
    public java.util.Vector locations = null;
    /** Optional member */
    public Delivery_Service_type proposed_delivery_service = null;


    public Conditional_Results_type(BigInteger conditions,
      java.lang.String date_for_reply,
      java.util.Vector locations,
      Delivery_Service_type proposed_delivery_service)
    {
        this.conditions=conditions;
        this.date_for_reply=date_for_reply;
        this.locations=locations;
        this.proposed_delivery_service=proposed_delivery_service;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("conditions="+conditions);
        sw.write("date_for_reply="+date_for_reply);
        sw.write("locations="+locations);
        sw.write("proposed_delivery_service="+proposed_delivery_service);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Conditional_Results_type() {}


}
