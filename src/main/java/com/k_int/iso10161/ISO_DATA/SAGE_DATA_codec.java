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
public class SAGE_DATA_codec extends base_codec
{
  private static Log log = LogFactory.getLog(SAGE_DATA_codec.class);
  public static SAGE_DATA_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private OctetString_codec i_octetstring_codec = OctetString_codec.getCodec();

  public synchronized static SAGE_DATA_codec getCodec()
  {
    if ( me == null )
    {
      me = new SAGE_DATA_codec();
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
    SAGE_DATA_type retval = (SAGE_DATA_type)type_instance;

    sm.implicit_settag(64, 99);
    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new SAGE_DATA_type();
      }

      retval.illNumber = (BigInteger)sm.implicit_tag(i_integer_codec, retval.illNumber, 128, 1, true, "illNumber");
      retval.status = (BigInteger)sm.implicit_tag(i_integer_codec, retval.status, 128, 2, true, "status");
      retval.problemStatus = (BigInteger)sm.implicit_tag(i_integer_codec, retval.problemStatus, 128, 3, true, "problemStatus");
      retval.iso_data = (byte[])sm.implicit_tag(i_octetstring_codec, retval.iso_data, 128, 4, true, "iso_data");
      sm.sequenceEnd();
    }

    return retval;
  }

}
