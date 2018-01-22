package com.k_int.iso10161.ILL_APDU_Delivery_Info;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
public class APDU_Delivery_Info_codec extends base_codec
{
  private static Log log = LogFactory.getLog(APDU_Delivery_Info_codec.class);
  public static APDU_Delivery_Info_codec me = null;

  private transponder_info_inline44_codec i_transponder_info_inline44_codec = transponder_info_inline44_codec.getCodec();
  private recipient_info_inline43_codec i_recipient_info_inline43_codec = recipient_info_inline43_codec.getCodec();
  private sender_info_inline42_codec i_sender_info_inline42_codec = sender_info_inline42_codec.getCodec();

  public synchronized static APDU_Delivery_Info_codec getCodec()
  {
    if ( me == null )
    {
      me = new APDU_Delivery_Info_codec();
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
    APDU_Delivery_Info_type retval = (APDU_Delivery_Info_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new APDU_Delivery_Info_type();
      }

      retval.sender_info = (java.util.Vector)sm.implicit_tag(i_sender_info_inline42_codec, retval.sender_info, 128, 0, false, "sender_info");
      retval.recipient_info = (java.util.Vector)sm.implicit_tag(i_recipient_info_inline43_codec, retval.recipient_info, 128, 1, false, "recipient_info");
      retval.transponder_info = (java.util.Vector)sm.implicit_tag(i_transponder_info_inline44_codec, retval.transponder_info, 128, 2, true, "transponder_info");
      sm.sequenceEnd();
    }

    return retval;
  }

}
