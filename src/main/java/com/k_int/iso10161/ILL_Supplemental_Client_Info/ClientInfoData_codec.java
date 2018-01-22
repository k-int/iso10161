package com.k_int.iso10161.ILL_Supplemental_Client_Info;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Id_type;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.System_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Postal_Address_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Postal_Address_type;
import com.k_int.iso10161.ISO_10161_ILL_1.Amount_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Amount_type;
public class ClientInfoData_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ClientInfoData_codec.class);
  public static ClientInfoData_codec me = null;

  private ClientInfoType_codec i_clientinfotype_codec = ClientInfoType_codec.getCodec();
  private infoContent_inline47_codec i_infocontent_inline47_codec = infoContent_inline47_codec.getCodec();

  public synchronized static ClientInfoData_codec getCodec()
  {
    if ( me == null )
    {
      me = new ClientInfoData_codec();
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
    ClientInfoData_type retval = (ClientInfoData_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new ClientInfoData_type();
      }

      retval.infoType = (ClientInfoType_type)i_clientinfotype_codec.serialize(sm, retval.infoType,false, "infoType");
      retval.infoContent = (java.util.Vector)sm.implicit_tag(i_infocontent_inline47_codec, retval.infoContent, 128, 3, false, "infoContent");
      sm.sequenceEnd();
    }

    return retval;
  }

}
