package com.k_int.iso10161.OCLCILLService;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class OCLCILLServiceType_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLCILLServiceType_codec.class);
  public static OCLCILLServiceType_codec me = null;

  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static OCLCILLServiceType_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLCILLServiceType_codec();
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
