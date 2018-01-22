package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Postal_Address_type 
 *  @author Auto generated bu A2J
 */ 
public class Postal_Address_type implements Serializable 
{
    /** Optional member */
    public Name_Of_Person_Or_Institution_type name_of_person_or_institution = null;
    /** Optional member */
    public ILL_String_type extended_postal_delivery_address = null;
    /** Optional member */
    public ILL_String_type street_and_number = null;
    /** Optional member */
    public ILL_String_type post_office_box = null;
    /** Optional member */
    public ILL_String_type city = null;
    /** Optional member */
    public ILL_String_type region = null;
    /** Optional member */
    public ILL_String_type country = null;
    /** Optional member */
    public ILL_String_type postal_code = null;


    public Postal_Address_type(Name_Of_Person_Or_Institution_type name_of_person_or_institution,
      ILL_String_type extended_postal_delivery_address,
      ILL_String_type street_and_number,
      ILL_String_type post_office_box,
      ILL_String_type city,
      ILL_String_type region,
      ILL_String_type country,
      ILL_String_type postal_code)
    {
        this.name_of_person_or_institution=name_of_person_or_institution;
        this.extended_postal_delivery_address=extended_postal_delivery_address;
        this.street_and_number=street_and_number;
        this.post_office_box=post_office_box;
        this.city=city;
        this.region=region;
        this.country=country;
        this.postal_code=postal_code;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("name_of_person_or_institution"=name_of_person_or_institution);
        sw.write("extended_postal_delivery_address"=extended_postal_delivery_address);
        sw.write("street_and_number"=street_and_number);
        sw.write("post_office_box"=post_office_box);
        sw.write("city"=city);
        sw.write("region"=region);
        sw.write("country"=country);
        sw.write("postal_code"=postal_code);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Postal_Address_type() {}


}
