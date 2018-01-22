package com.k_int.iso10161.OCLCILLRequestExtension;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : OCLCILLRequestExtension_type 
 *  @author Auto generated bu A2J
 */ 
public class OCLCILLRequestExtension_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type clientDepartment = null;
    /** Optional member */
    public ILL_String_type paymentMethod = null;
    /** Optional member */
    public ILL_String_type uniformTitle = null;
    /** Optional member */
    public ILL_String_type dissertation = null;
    /** Optional member */
    public ILL_String_type issueNumber = null;
    /** Optional member */
    public ILL_String_type volume = null;
    /** Optional member */
    public ILL_String_type affiliations = null;
    /** Optional member */
    public ILL_String_type source = null;


    public OCLCILLRequestExtension_type(ILL_String_type clientDepartment,
      ILL_String_type paymentMethod,
      ILL_String_type uniformTitle,
      ILL_String_type dissertation,
      ILL_String_type issueNumber,
      ILL_String_type volume,
      ILL_String_type affiliations,
      ILL_String_type source)
    {
        this.clientDepartment=clientDepartment;
        this.paymentMethod=paymentMethod;
        this.uniformTitle=uniformTitle;
        this.dissertation=dissertation;
        this.issueNumber=issueNumber;
        this.volume=volume;
        this.affiliations=affiliations;
        this.source=source;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("clientDepartment="+clientDepartment);
        sw.write("paymentMethod="+paymentMethod);
        sw.write("uniformTitle="+uniformTitle);
        sw.write("dissertation="+dissertation);
        sw.write("issueNumber="+issueNumber);
        sw.write("volume="+volume);
        sw.write("affiliations="+affiliations);
        sw.write("source="+source);
        sw.write("\n}\n");
        return sw.toString();
    }

    public OCLCILLRequestExtension_type() {}


}
