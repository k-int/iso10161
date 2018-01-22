package com.k_int.iso10161.ISO_DATA;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_codec;
import com.k_int.iso10161.ILL_APDU_Delivery_Info.APDU_Delivery_Info_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Requester_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Responder_Optional_Messages_Type_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Transaction_Id_type;
public class Responder_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Responder_codec.class);
  public static Responder_codec me = null;

  // handle on parents base encode function
  private Pm_Data_codec i_pm_data_codec = Pm_Data_codec.getCodec();

  public synchronized static Responder_codec getCodec()
  {
    if ( me == null )
    {
      me = new Responder_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_pm_data_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
