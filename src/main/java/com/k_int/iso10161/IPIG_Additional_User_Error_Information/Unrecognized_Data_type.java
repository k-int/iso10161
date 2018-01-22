package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Unrecognized_Data_type 
 *  @author Auto generated bu A2J
 */ 
public class Unrecognized_Data_type implements Serializable 
{
    /** Mandatory member */
    public ILL_String_type element = null;
    /** Optional member */
    public ILL_String_type data = null;
    /** Optional member */
    public ILL_String_type expected_format = null;
    /** Optional member */
    public ILL_String_type supported_values = null;


    public Unrecognized_Data_type(ILL_String_type element,
      ILL_String_type data,
      ILL_String_type expected_format,
      ILL_String_type supported_values)
    {
        this.element=element;
        this.data=data;
        this.expected_format=expected_format;
        this.supported_values=supported_values;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("element"=element);
        sw.write("data"=data);
        sw.write("expected_format"=expected_format);
        sw.write("supported_values"=supported_values);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Unrecognized_Data_type() {}


}
