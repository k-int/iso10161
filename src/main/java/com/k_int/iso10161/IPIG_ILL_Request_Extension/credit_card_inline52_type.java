package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : credit_card_inline52_type 
 *  @author Auto generated bu A2J
 */ 
public class credit_card_inline52_type implements Serializable 
{
    /** Mandatory member */
    public type_inline53_type type = null;
    /** Mandatory member */
    public ILL_String_type card_number = null;
    /** Mandatory member */
    public ILL_String_type expiry_date = null;
    /** Mandatory member */
    public ILL_String_type name_on_card = null;


    public credit_card_inline52_type(type_inline53_type type,
      ILL_String_type card_number,
      ILL_String_type expiry_date,
      ILL_String_type name_on_card)
    {
        this.type=type;
        this.card_number=card_number;
        this.expiry_date=expiry_date;
        this.name_on_card=name_on_card;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("type"=type);
        sw.write("card_number"=card_number);
        sw.write("expiry_date"=expiry_date);
        sw.write("name_on_card"=name_on_card);
        sw.write("\n}\n");
        return sw.toString();
    }

    public credit_card_inline52_type() {}


}
