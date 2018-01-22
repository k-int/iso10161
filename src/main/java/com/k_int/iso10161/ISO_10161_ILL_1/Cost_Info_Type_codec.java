package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Cost_Info_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Cost_Info_Type_codec.class);
  public static Cost_Info_Type_codec me = null;

  private BOOL_codec i_bool_codec = BOOL_codec.getCodec();
  private Account_Number_codec i_account_number_codec = Account_Number_codec.getCodec();
  private Amount_codec i_amount_codec = Amount_codec.getCodec();

  public synchronized static Cost_Info_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Cost_Info_Type_codec();
    }
    return me;
  }

/** Convert this java type to or from a string of octets using the supplied 
 *  serialisation manager
 *  @author A2J Auto Generated Java Class
 *  @param sm The Serialisation Manager 
 *  @param type_instance If we are encoding, the type to encode.
 *  @param is_optional Flag indicating if this type is optional
 *  @param type_name The type name for diagnostic information
 *  @return A decoded java type or the type that was passed in for encoding
 */  
  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Cost_Info_Type_type retval = (Cost_Info_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Cost_Info_Type_type();
      }

      retval.account_number = (ILL_String_type)sm.explicit_tag(i_account_number_codec, retval.account_number, 128, 0, true, "account_number");
      retval.maximum_cost = (Amount_type)sm.implicit_tag(i_amount_codec, retval.maximum_cost, 128, 1, true, "maximum_cost");
      retval.reciprocal_agreement = (Boolean)sm.implicit_tag(i_bool_codec, retval.reciprocal_agreement, 128, 2, false, "reciprocal_agreement");
      retval.will_pay_fee = (Boolean)sm.implicit_tag(i_bool_codec, retval.will_pay_fee, 128, 3, false, "will_pay_fee");
      retval.payment_provided = (Boolean)sm.implicit_tag(i_bool_codec, retval.payment_provided, 128, 4, false, "payment_provided");
      sm.sequenceEnd();
    }

    return retval;
  }

}
