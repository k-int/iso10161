package com.k_int.iso10161.Suppliers_Reference;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Suppliers_Reference_type 
 *  @author Auto generated bu A2J
 */ 
public class Suppliers_Reference_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type supplier_authority = null;
    /** Mandatory member */
    public ILL_String_type supplier_reference = null;


    public Suppliers_Reference_type(ILL_String_type supplier_authority,
      ILL_String_type supplier_reference)
    {
        this.supplier_authority=supplier_authority;
        this.supplier_reference=supplier_reference;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("supplier_authority"=supplier_authority);
        sw.write("supplier_reference"=supplier_reference);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Suppliers_Reference_type() {}


}
