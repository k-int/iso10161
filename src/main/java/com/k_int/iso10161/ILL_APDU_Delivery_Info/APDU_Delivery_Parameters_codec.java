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
public class APDU_Delivery_Parameters_codec extends base_codec
{
  private static Log log = LogFactory.getLog(APDU_Delivery_Parameters_codec.class);
  public static APDU_Delivery_Parameters_codec me = null;

  private aliases_inline46_codec i_aliases_inline46_codec = aliases_inline46_codec.getCodec();
  private encoding_inline45_codec i_encoding_inline45_codec = encoding_inline45_codec.getCodec();
  private System_Address_codec i_system_address_codec = System_Address_codec.getCodec();

  public synchronized static APDU_Delivery_Parameters_codec getCodec()
  {
    if ( me == null )
    {
      me = new APDU_Delivery_Parameters_codec();
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
    APDU_Delivery_Parameters_type retval = (APDU_Delivery_Parameters_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new APDU_Delivery_Parameters_type();
      }

      retval.encoding = (java.util.Vector)sm.implicit_tag(i_encoding_inline45_codec, retval.encoding, 128, 0, false, "encoding");
      retval.transport = (System_Address_type)sm.implicit_tag(i_system_address_codec, retval.transport, 128, 1, false, "transport");
      retval.aliases = (java.util.Vector)sm.implicit_tag(i_aliases_inline46_codec, retval.aliases, 128, 2, true, "aliases");
      sm.sequenceEnd();
    }

    return retval;
  }

}
