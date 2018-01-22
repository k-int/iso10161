package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : document_type_inline28_type 
 *  @author Auto generated bu A2J
 */ 
public class document_type_inline28_type implements Serializable 
{
    /** Mandatory member */
    public int[] document_type_id = null;
    /** Mandatory member */
    public Object document_type_parameters = null;


    public document_type_inline28_type(int[] document_type_id,
      Object document_type_parameters)
    {
        this.document_type_id=document_type_id;
        this.document_type_parameters=document_type_parameters;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("document_type_id="+document_type_id);
        sw.write("document_type_parameters="+document_type_parameters);
        sw.write("\n}\n");
        return sw.toString();
    }

    public document_type_inline28_type() {}


}
