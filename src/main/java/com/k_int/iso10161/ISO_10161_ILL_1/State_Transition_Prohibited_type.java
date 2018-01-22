package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : State_Transition_Prohibited_type 
 *  @author Auto generated bu A2J
 */ 
public class State_Transition_Prohibited_type implements Serializable 
{
    /** Mandatory member */
    public java.math.BigInteger aPDU_type = null;
    /** Mandatory member */
    public java.math.BigInteger current_state = null;


    public State_Transition_Prohibited_type(java.math.BigInteger aPDU_type,
      java.math.BigInteger current_state)
    {
        this.aPDU_type=aPDU_type;
        this.current_state=current_state;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("aPDU_type="+aPDU_type);
        sw.write("current_state="+current_state);
        sw.write("\n}\n");
        return sw.toString();
    }

    public State_Transition_Prohibited_type() {}


}
