package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Payment_Type_choice51_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Payment_Type_choice51_codec.class);
  public static Payment_Type_choice51_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(1), NULL_codec.getCodec() , "reciprocal_agreement", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(2), NULL_codec.getCodec() , "prepaid", new Integer(1) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(3), NULL_codec.getCodec() , "uNESCO_voucher", new Integer(2) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(4), NULL_codec.getCodec() , "aLIA_voucher", new Integer(3) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(5), NULL_codec.getCodec() , "iFLA_voucher", new Integer(4) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(6), ILL_String_codec.getCodec() , "other_voucher_or_coupon", new Integer(5) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(7), NULL_codec.getCodec() , "rLG_shares", new Integer(6) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(8), NULL_codec.getCodec() , "oCLC_iFM", new Integer(7) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(9), ILL_String_codec.getCodec() , "other_payment_scheme", new Integer(8) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(10), NULL_codec.getCodec() , "cash", new Integer(9) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(11), NULL_codec.getCodec() , "check", new Integer(10) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(12), credit_card_inline52_codec.getCodec() , "credit_card", new Integer(11) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(13), deposit_account_inline54_codec.getCodec() , "deposit_account", new Integer(12) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(14), bank_electronic_payment_inline55_codec.getCodec() , "bank_electronic_payment", new Integer(13) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(15), ILL_String_codec.getCodec() , "other_payment_type", new Integer(14) }
  };

  public synchronized static Payment_Type_choice51_codec getCodec()
  {
    if ( me == null )
    {
      me = new Payment_Type_choice51_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Payment_Type_choice51_type retval = (Payment_Type_choice51_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Payment_Type_choice51_type();
        retval = (Payment_Type_choice51_type)sm.choice(retval, choice_info, type_name);
      }
      else
      {
        if ( retval != null )
          sm.choice(retval, choice_info, type_name);
      }

      if ( ( retval==null ) && ( !is_optional ) )
      {
        log.info("Missing mandatory choice for "+type_name);
      }

    return retval;
  }

}
