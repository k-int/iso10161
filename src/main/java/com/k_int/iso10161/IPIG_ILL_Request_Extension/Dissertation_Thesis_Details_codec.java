package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Dissertation_Thesis_Details_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Dissertation_Thesis_Details_codec.class);
  public static Dissertation_Thesis_Details_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Dissertation_Thesis_Details_codec getCodec()
  {
    if ( me == null )
    {
      me = new Dissertation_Thesis_Details_codec();
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
    Dissertation_Thesis_Details_type retval = (Dissertation_Thesis_Details_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Dissertation_Thesis_Details_type();
      }

      retval.granting_institution = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.granting_institution, 128, 1, true, "granting_institution");
      retval.date_granted = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.date_granted, 128, 2, true, "date_granted");
      sm.sequenceEnd();
    }

    return retval;
  }

}
