package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Damaged_Details_type 
 *  @author Auto generated bu A2J
 */ 
public class Damaged_Details_type implements Serializable 
{
    /** Optional member */
    public int[] document_type_id = null;
    /** Mandatory member */
    public damaged_portion_inline24_type damaged_portion = null;


    public Damaged_Details_type(int[] document_type_id,
      damaged_portion_inline24_type damaged_portion)
    {
        this.document_type_id=document_type_id;
        this.damaged_portion=damaged_portion;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("document_type_id="+document_type_id);
        sw.write("damaged_portion="+damaged_portion);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Damaged_Details_type() {}


}
