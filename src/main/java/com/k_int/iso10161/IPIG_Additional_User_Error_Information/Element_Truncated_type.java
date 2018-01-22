package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Element_Truncated_type 
 *  @author Auto generated bu A2J
 */ 
public class Element_Truncated_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type element = null;
    /** Mandatory member */
    public ILL_String_type truncated_value = null;


    public Element_Truncated_type(ILL_String_type element,
      ILL_String_type truncated_value)
    {
        this.element=element;
        this.truncated_value=truncated_value;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("element="+element);
        sw.write("truncated_value="+truncated_value);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Element_Truncated_type() {}


}
