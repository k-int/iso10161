package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Place_On_Hold_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Place_On_Hold_Type_codec.class);
  public static Place_On_Hold_Type_codec me = null;

  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Place_On_Hold_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Place_On_Hold_Type_codec();
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
