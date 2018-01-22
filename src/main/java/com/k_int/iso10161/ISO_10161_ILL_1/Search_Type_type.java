package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Search_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Search_Type_type implements Serializable 
{
    /** Optional member */
    public ILL_String_type level_of_service = null;
    /** Optional member */
    public java.lang.String need_before_date = null;
    /** Mandatory member */
    public BigInteger expiry_flag = null;
    /** Optional member */
    public java.lang.String expiry_date = null;


    public Search_Type_type(ILL_String_type level_of_service,
      java.lang.String need_before_date,
      BigInteger expiry_flag,
      java.lang.String expiry_date)
    {
        this.level_of_service=level_of_service;
        this.need_before_date=need_before_date;
        this.expiry_flag=expiry_flag;
        this.expiry_date=expiry_date;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("level_of_service="+level_of_service);
        sw.write("need_before_date="+need_before_date);
        sw.write("expiry_flag="+expiry_flag);
        sw.write("expiry_date="+expiry_date);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Search_Type_type() {}


}
