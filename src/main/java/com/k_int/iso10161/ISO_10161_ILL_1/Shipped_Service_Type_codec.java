package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Shipped_Service_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Shipped_Service_Type_codec.class);
  public static Shipped_Service_Type_codec me = null;

  // handle on parents base encode function
  private ILL_Service_Type_codec i_ill_service_type_codec = ILL_Service_Type_codec.getCodec();

  public synchronized static Shipped_Service_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Shipped_Service_Type_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_ill_service_type_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
