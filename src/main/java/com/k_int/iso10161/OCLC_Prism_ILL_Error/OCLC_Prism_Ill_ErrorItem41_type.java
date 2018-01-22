package com.k_int.iso10161.OCLC_Prism_ILL_Error;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
/** A Java holder for the ASN type : OCLC_Prism_Ill_ErrorItem41_type 
 *  @author Auto generated bu A2J
 */ 
public class OCLC_Prism_Ill_ErrorItem41_type implements Serializable 
{
    /** Optional member */
    public BigInteger prism_Ill_Field_Id = null;
    /** Optional member */
    public BigInteger prism_Ill_Error_Code = null;
    /** Optional member */
    public ILL_String_type prism_Ill_Error_Text = null;


    public OCLC_Prism_Ill_ErrorItem41_type(BigInteger prism_Ill_Field_Id,
      BigInteger prism_Ill_Error_Code,
      ILL_String_type prism_Ill_Error_Text)
    {
        this.prism_Ill_Field_Id=prism_Ill_Field_Id;
        this.prism_Ill_Error_Code=prism_Ill_Error_Code;
        this.prism_Ill_Error_Text=prism_Ill_Error_Text;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("prism_Ill_Field_Id"=prism_Ill_Field_Id);
        sw.write("prism_Ill_Error_Code"=prism_Ill_Error_Code);
        sw.write("prism_Ill_Error_Text"=prism_Ill_Error_Text);
        sw.write("\n}\n");
        return sw.toString();
    }

    public OCLC_Prism_Ill_ErrorItem41_type() {}


}
