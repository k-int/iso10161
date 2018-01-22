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
public class History_codec extends base_codec
{
  private static Log log = LogFactory.getLog(History_codec.class);
  public static History_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private GeneralString_codec i_generalstring_codec = GeneralString_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();

  public synchronized static History_codec getCodec()
  {
    if ( me == null )
    {
      me = new History_codec();
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
    History_type retval = (History_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new History_type();
      }

      retval.service_type = (BigInteger)sm.implicit_tag(i_integer_codec, retval.service_type, 128, 15, false, "service_type");
      retval.datetime = (java.lang.String)sm.implicit_tag(i_generalstring_codec, retval.datetime, 128, 16, false, "datetime");
      retval.initiator = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.initiator, 128, 17, false, "initiator");
      retval.note = (java.lang.String)sm.implicit_tag(i_generalstring_codec, retval.note, 128, 18, true, "note");
      sm.sequenceEnd();
    }

    return retval;
  }

}
