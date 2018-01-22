package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Requester_Optional_Messages_Type_type 
 *  @author Auto generated bu A2J
 */ 
public class Requester_Optional_Messages_Type_type implements Serializable 
{
    /** Mandatory member */
    public Boolean can_send_RECEIVED = null;
    /** Mandatory member */
    public Boolean can_send_RETURNED = null;
    /** Mandatory member */
    public BigInteger requester_SHIPPED = null;
    /** Mandatory member */
    public BigInteger requester_CHECKED_IN = null;


    public Requester_Optional_Messages_Type_type(Boolean can_send_RECEIVED,
      Boolean can_send_RETURNED,
      BigInteger requester_SHIPPED,
      BigInteger requester_CHECKED_IN)
    {
        this.can_send_RECEIVED=can_send_RECEIVED;
        this.can_send_RETURNED=can_send_RETURNED;
        this.requester_SHIPPED=requester_SHIPPED;
        this.requester_CHECKED_IN=requester_CHECKED_IN;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("can_send_RECEIVED="+can_send_RECEIVED);
        sw.write("can_send_RETURNED="+can_send_RETURNED);
        sw.write("requester_SHIPPED="+requester_SHIPPED);
        sw.write("requester_CHECKED_IN="+requester_CHECKED_IN);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Requester_Optional_Messages_Type_type() {}


}
