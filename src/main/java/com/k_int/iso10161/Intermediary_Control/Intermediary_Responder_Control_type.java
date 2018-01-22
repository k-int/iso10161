package com.k_int.iso10161.Intermediary_Control;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import java.math.BigInteger;
import com.k_int.iso10161.ISO_10161_ILL_1.Conditional_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Retry_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Unfilled_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Locations_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Will_Supply_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Hold_Placed_Results_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Estimate_Results_type;
/** A Java holder for the ASN type : Intermediary_Responder_Control_type 
 *  @author Auto generated bu A2J
 */ 
public class Intermediary_Responder_Control_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger transactionResults = null;
    /** Optional member */
    public resultsExplanation_inline57_type resultsExplanation = null;
    /** Mandatory member */
    public System_Id_type responderId = null;


    public Intermediary_Responder_Control_type(java.math.BigInteger transactionResults,
      resultsExplanation_inline57_type resultsExplanation,
      System_Id_type responderId)
    {
        this.transactionResults=transactionResults;
        this.resultsExplanation=resultsExplanation;
        this.responderId=responderId;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("transactionResults="+transactionResults);
        sw.write("resultsExplanation="+resultsExplanation);
        sw.write("responderId="+responderId);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Intermediary_Responder_Control_type() {}


}
