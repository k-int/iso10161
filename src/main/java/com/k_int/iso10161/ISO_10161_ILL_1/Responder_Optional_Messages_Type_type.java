package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Responder_Optional_Messages_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Responder_Optional_Messages_Type_type implements Serializable 
{
    /** Mandatory member */
    public Boolean can_send_SHIPPED = null;
    /** Mandatory member */
    public Boolean can_send_CHECKED_IN = null;
    /** Mandatory member */
    public BigInteger responder_RECEIVED = null;
    /** Mandatory member */
    public BigInteger responder_RETURNED = null;


    public Responder_Optional_Messages_Type_type(Boolean can_send_SHIPPED,
      Boolean can_send_CHECKED_IN,
      BigInteger responder_RECEIVED,
      BigInteger responder_RETURNED)
    {
        this.can_send_SHIPPED=can_send_SHIPPED;
        this.can_send_CHECKED_IN=can_send_CHECKED_IN;
        this.responder_RECEIVED=responder_RECEIVED;
        this.responder_RETURNED=responder_RETURNED;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("can_send_SHIPPED"=can_send_SHIPPED);
        sw.write("can_send_CHECKED_IN"=can_send_CHECKED_IN);
        sw.write("responder_RECEIVED"=responder_RECEIVED);
        sw.write("responder_RETURNED"=responder_RETURNED);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Responder_Optional_Messages_Type_type() {}


}
