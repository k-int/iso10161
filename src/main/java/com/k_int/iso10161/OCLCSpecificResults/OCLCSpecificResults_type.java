package com.k_int.iso10161.OCLCSpecificResults;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : OCLCSpecificResults_type 
 *  @author Auto generated bu A2J
 */ 
public class OCLCSpecificResults_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger oclcSpecificStatus = null;
    /** Optional member */
    public java.util.Vector reasonInReviewList = null;


    public OCLCSpecificResults_type(java.math.BigInteger oclcSpecificStatus,
      java.util.Vector reasonInReviewList)
    {
        this.oclcSpecificStatus=oclcSpecificStatus;
        this.reasonInReviewList=reasonInReviewList;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("oclcSpecificStatus="+oclcSpecificStatus);
        sw.write("reasonInReviewList="+reasonInReviewList);
        sw.write("\n}\n");
        return sw.toString();
    }

    public OCLCSpecificResults_type() {}


}
