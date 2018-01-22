package com.k_int.iso10161.Internal_Reference_Number;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Internal_Reference_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Internal_Reference_Type_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type reference_authority = null;
    /** Mandatory member */
    public ILL_String_type internal_reference = null;


    public Internal_Reference_Type_type(ILL_String_type reference_authority,
      ILL_String_type internal_reference)
    {
        this.reference_authority=reference_authority;
        this.internal_reference=internal_reference;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reference_authority"=reference_authority);
        sw.write("internal_reference"=internal_reference);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Internal_Reference_Type_type() {}


}
