package com.k_int.iso10161.OCLCSpecificResults;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : ReasonInReviewListItem56_type 
 *  @author Auto generated bu A2J
 */ 
public class ReasonInReviewListItem56_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger reasonInReview = null;
    /** Optional member */
    public ILL_String_type reasonInReviewText = null;


    public ReasonInReviewListItem56_type(java.math.BigInteger reasonInReview,
      ILL_String_type reasonInReviewText)
    {
        this.reasonInReview=reasonInReview;
        this.reasonInReviewText=reasonInReviewText;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("reasonInReview="+reasonInReview);
        sw.write("reasonInReviewText="+reasonInReviewText);
        sw.write("\n}\n");
        return sw.toString();
    }

    public ReasonInReviewListItem56_type() {}


}
