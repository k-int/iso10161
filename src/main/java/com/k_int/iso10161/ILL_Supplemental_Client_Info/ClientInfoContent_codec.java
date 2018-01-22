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
public class ClientInfoContent_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ClientInfoContent_codec.class);
  public static ClientInfoContent_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), ILL_String_codec.getCodec() , "stringContent", new Integer(0) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(2), Postal_Address_codec.getCodec() , "postalAddress", new Integer(1) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(3), System_Id_codec.getCodec() , "nameOrId", new Integer(2) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(4), StatusCode_codec.getCodec() , "statusCode", new Integer(3) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(5), Integer_codec.getCodec() , "definedNumber", new Integer(4) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(6), ClientInfoData_codec.getCodec() , "nested", new Integer(5) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(7), Amount_codec.getCodec() , "amount", new Integer(6) }
  };

  public synchronized static ClientInfoContent_codec getCodec()
  {
    if ( me == null )
    {
      me = new ClientInfoContent_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    ClientInfoContent_type retval = (ClientInfoContent_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new ClientInfoContent_type();
        retval = (ClientInfoContent_type)sm.choice(retval, choice_info, type_name);
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
