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
public class ClientInfoType_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ClientInfoType_codec.class);
  public static ClientInfoType_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), Standard_Client_Info_Type_codec.getCodec() , "standard", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), ILL_String_codec.getCodec() , "local", new Integer(1) }
  };

  public synchronized static ClientInfoType_codec getCodec()
  {
    if ( me == null )
    {
      me = new ClientInfoType_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    ClientInfoType_type retval = (ClientInfoType_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new ClientInfoType_type();
        retval = (ClientInfoType_type)sm.choice(retval, choice_info, type_name);
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
