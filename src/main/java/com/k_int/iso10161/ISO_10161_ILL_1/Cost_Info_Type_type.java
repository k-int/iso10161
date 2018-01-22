package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Cost_Info_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Cost_Info_Type_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type account_number = null;
    /** Optional member */
    public Amount_type maximum_cost = null;
    /** Mandatory member */
    public Boolean reciprocal_agreement = null;
    /** Mandatory member */
    public Boolean will_pay_fee = null;
    /** Mandatory member */
    public Boolean payment_provided = null;


    public Cost_Info_Type_type(ILL_String_type account_number,
      Amount_type maximum_cost,
      Boolean reciprocal_agreement,
      Boolean will_pay_fee,
      Boolean payment_provided)
    {
        this.account_number=account_number;
        this.maximum_cost=maximum_cost;
        this.reciprocal_agreement=reciprocal_agreement;
        this.will_pay_fee=will_pay_fee;
        this.payment_provided=payment_provided;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("account_number"=account_number);
        sw.write("maximum_cost"=maximum_cost);
        sw.write("reciprocal_agreement"=reciprocal_agreement);
        sw.write("will_pay_fee"=will_pay_fee);
        sw.write("payment_provided"=payment_provided);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Cost_Info_Type_type() {}


}
