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
public class ISO_DATA_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ISO_DATA_codec.class);
  public static ISO_DATA_codec me = null;

  private OctetString_codec i_octetstring_codec = OctetString_codec.getCodec();
  private Pm_Data_codec i_pm_data_codec = Pm_Data_codec.getCodec();

  public synchronized static ISO_DATA_codec getCodec()
  {
    if ( me == null )
    {
      me = new ISO_DATA_codec();
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
    ISO_DATA_type retval = (ISO_DATA_type)type_instance;

    sm.implicit_settag(128, 68);
    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new ISO_DATA_type();
      }

      retval.flags = (byte[])sm.implicit_tag(i_octetstring_codec, retval.flags, 128, 9, false, "flags");
      retval.requester = (Pm_Data_type)sm.implicit_tag(i_pm_data_codec, retval.requester, 128, 1, true, "requester");
      retval.responder = (Pm_Data_type)sm.implicit_tag(i_pm_data_codec, retval.responder, 128, 7, true, "responder");
      retval.ppartner = (byte[])sm.implicit_tag(i_octetstring_codec, retval.ppartner, 128, 8, true, "ppartner");
      sm.sequenceEnd();
    }

    return retval;
  }

}
