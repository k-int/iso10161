package com.k_int.iso10161.OCLCILLService;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : OCLCILLService_type 
 *  @author Auto generated bu A2J
 */ 
public class OCLCILLService_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger oCLCILLServiceType = null;


    public OCLCILLService_type(java.math.BigInteger oCLCILLServiceType)
    {
        this.oCLCILLServiceType=oCLCILLServiceType;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("oCLCILLServiceType="+oCLCILLServiceType);
        sw.write("\n}\n");
        return sw.toString();
    }

    public OCLCILLService_type() {}


}
