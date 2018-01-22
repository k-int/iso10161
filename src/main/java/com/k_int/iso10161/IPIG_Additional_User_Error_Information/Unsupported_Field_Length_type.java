package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Unsupported_Field_Length_type 
 *  @author Auto generated bu A2J
 */ 
public class Unsupported_Field_Length_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type element = null;
    /** Optional member */
    public BigInteger min_length = null;
    /** Optional member */
    public BigInteger max_length = null;


    public Unsupported_Field_Length_type(ILL_String_type element,
      BigInteger min_length,
      BigInteger max_length)
    {
        this.element=element;
        this.min_length=min_length;
        this.max_length=max_length;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("element"=element);
        sw.write("min_length"=min_length);
        sw.write("max_length"=max_length);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Unsupported_Field_Length_type() {}


}
