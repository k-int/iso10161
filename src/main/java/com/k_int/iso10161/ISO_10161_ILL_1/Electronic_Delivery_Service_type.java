package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Electronic_Delivery_Service_type 
 *  @author Auto generated bu A2J
 */ 
public class Electronic_Delivery_Service_type implements Serializable 
{
    /** Optional member */
    public e_delivery_service_inline27_type e_delivery_service = null;
    /** Optional member */
    public document_type_inline28_type document_type = null;
    /** Optional member */
    public ILL_String_type e_delivery_description = null;
    /** Mandatory member */
    public e_delivery_details_inline29_type e_delivery_details = null;
    /** Optional member */
    public ILL_String_type name_or_code = null;
    /** Optional member */
    public java.lang.String delivery_time = null;


    public Electronic_Delivery_Service_type(e_delivery_service_inline27_type e_delivery_service,
      document_type_inline28_type document_type,
      ILL_String_type e_delivery_description,
      e_delivery_details_inline29_type e_delivery_details,
      ILL_String_type name_or_code,
      java.lang.String delivery_time)
    {
        this.e_delivery_service=e_delivery_service;
        this.document_type=document_type;
        this.e_delivery_description=e_delivery_description;
        this.e_delivery_details=e_delivery_details;
        this.name_or_code=name_or_code;
        this.delivery_time=delivery_time;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("e_delivery_service"=e_delivery_service);
        sw.write("document_type"=document_type);
        sw.write("e_delivery_description"=e_delivery_description);
        sw.write("e_delivery_details"=e_delivery_details);
        sw.write("name_or_code"=name_or_code);
        sw.write("delivery_time"=delivery_time);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Electronic_Delivery_Service_type() {}


}
