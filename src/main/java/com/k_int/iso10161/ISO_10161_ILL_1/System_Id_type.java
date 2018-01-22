package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : System_Id_type 
 *  @author Auto generated bu A2J
 */ 
public class System_Id_type implements Serializable 
{
    /** Optional member */
    public Person_Or_Institution_Symbol_type person_or_institution_symbol = null;
    /** Optional member */
    public Name_Of_Person_Or_Institution_type name_of_person_or_institution = null;


    public System_Id_type(Person_Or_Institution_Symbol_type person_or_institution_symbol,
      Name_Of_Person_Or_Institution_type name_of_person_or_institution)
    {
        this.person_or_institution_symbol=person_or_institution_symbol;
        this.name_of_person_or_institution=name_of_person_or_institution;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("person_or_institution_symbol"=person_or_institution_symbol);
        sw.write("name_of_person_or_institution"=name_of_person_or_institution);
        sw.write("\n}\n");
        return sw.toString();
    }

    public System_Id_type() {}


}
