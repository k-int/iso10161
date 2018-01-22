package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Will_Supply_Results_type 
 *  @author Auto generated bu A2J
 */ 
public class Will_Supply_Results_type implements Serializable 
{
    /** Mandatory member */
    public BigInteger reason_will_supply = null;
    /** Optional member */
    public java.lang.String supply_date = null;
    /** Optional member */
    public Postal_Address_type return_to_address = null;
    /** Optional member */
    public java.util.Vector locations = null;
    /** Optional member */
    public Electronic_Delivery_Service_type electronic_delivery_service = null;


    public Will_Supply_Results_type(BigInteger reason_will_supply,
      java.lang.String supply_date,
      Postal_Address_type return_to_address,
      java.util.Vector locations,
      Electronic_Delivery_Service_type electronic_delivery_service)
    {
        this.reason_will_supply=reason_will_supply;
        this.supply_date=supply_date;
        this.return_to_address=return_to_address;
        this.locations=locations;
        this.electronic_delivery_service=electronic_delivery_service;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reason_will_supply"=reason_will_supply);
        sw.write("supply_date"=supply_date);
        sw.write("return_to_address"=return_to_address);
        sw.write("locations"=locations);
        sw.write("electronic_delivery_service"=electronic_delivery_service);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Will_Supply_Results_type() {}


}
