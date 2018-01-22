package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Supply_Details_type 
 *  @author Auto generated bu A2J
 */ 
public class Supply_Details_type implements Serializable 
{
    /** Optional member */
    public java.lang.String date_shipped = null;
    /** Optional member */
    public Date_Due_type date_due = null;
    /** Optional member */
    public BigInteger chargeable_units = null;
    /** Optional member */
    public Amount_type cost = null;
    /** Optional member */
    public BigInteger shipped_conditions = null;
    /** Optional member */
    public shipped_via_inline37_type shipped_via = null;
    /** Optional member */
    public Amount_type insured_for = null;
    /** Optional member */
    public Amount_type return_insurance_require = null;
    /** Optional member */
    public java.util.Vector no_of_units_per_medium = null;


    public Supply_Details_type(java.lang.String date_shipped,
      Date_Due_type date_due,
      BigInteger chargeable_units,
      Amount_type cost,
      BigInteger shipped_conditions,
      shipped_via_inline37_type shipped_via,
      Amount_type insured_for,
      Amount_type return_insurance_require,
      java.util.Vector no_of_units_per_medium)
    {
        this.date_shipped=date_shipped;
        this.date_due=date_due;
        this.chargeable_units=chargeable_units;
        this.cost=cost;
        this.shipped_conditions=shipped_conditions;
        this.shipped_via=shipped_via;
        this.insured_for=insured_for;
        this.return_insurance_require=return_insurance_require;
        this.no_of_units_per_medium=no_of_units_per_medium;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("date_shipped"=date_shipped);
        sw.write("date_due"=date_due);
        sw.write("chargeable_units"=chargeable_units);
        sw.write("cost"=cost);
        sw.write("shipped_conditions"=shipped_conditions);
        sw.write("shipped_via"=shipped_via);
        sw.write("insured_for"=insured_for);
        sw.write("return_insurance_require"=return_insurance_require);
        sw.write("no_of_units_per_medium"=no_of_units_per_medium);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Supply_Details_type() {}


}
