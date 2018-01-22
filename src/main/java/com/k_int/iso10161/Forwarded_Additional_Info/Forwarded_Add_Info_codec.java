package com.k_int.iso10161.Forwarded_Additional_Info;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.Unfilled_Results_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.Unfilled_Results_type;
public class Forwarded_Add_Info_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Forwarded_Add_Info_codec.class);
  public static Forwarded_Add_Info_codec me = null;

  // handle on parents base encode function
  private Unfilled_Results_codec i_unfilled_results_codec = Unfilled_Results_codec.getCodec();

  public synchronized static Forwarded_Add_Info_codec getCodec()
  {
    if ( me == null )
    {
      me = new Forwarded_Add_Info_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    return i_unfilled_results_codec.serialize(sm, type_instance, is_optional, type_name);
  }

}
