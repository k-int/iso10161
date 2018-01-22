package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : e_delivery_service_inline27_type 
 *  @author Auto generated bu A2J
 */ 
public class e_delivery_service_inline27_type implements Serializable 
{
    /** Mandatory member */
    public int[] e_delivery_mode = null;
    /** Mandatory member */
    public Object e_delivery_parameters = null;


    public e_delivery_service_inline27_type(int[] e_delivery_mode,
      Object e_delivery_parameters)
    {
        this.e_delivery_mode=e_delivery_mode;
        this.e_delivery_parameters=e_delivery_parameters;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("e_delivery_mode="+e_delivery_mode);
        sw.write("e_delivery_parameters="+e_delivery_parameters);
        sw.write("\n}\n");
        return sw.toString();
    }

    public e_delivery_service_inline27_type() {}


}
