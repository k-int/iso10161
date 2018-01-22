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
public class Standard_Client_Info_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Standard_Client_Info_Type_codec.class);
  public static Standard_Client_Info_Type_codec me = null;

  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Standard_Client_Info_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Standard_Client_Info_Type_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_enumerated_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
