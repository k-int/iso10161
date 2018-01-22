package com.k_int.iso10161.Internal_Reference_Number;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : Internal_Reference_type 
 *  @author Auto generated bu A2J
 */ 
public class Internal_Reference_type implements Serializable 
{
    /** Optional member */
    public Internal_Reference_Type_type requester_reference = null;
    /** Optional member */
    public Internal_Reference_Type_type responder_reference = null;


    public Internal_Reference_type(Internal_Reference_Type_type requester_reference,
      Internal_Reference_Type_type responder_reference)
    {
        this.requester_reference=requester_reference;
        this.responder_reference=responder_reference;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("requester_reference="+requester_reference);
        sw.write("responder_reference="+responder_reference);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Internal_Reference_type() {}


}
