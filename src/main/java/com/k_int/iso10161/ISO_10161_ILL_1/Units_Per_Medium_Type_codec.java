package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Units_Per_Medium_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Units_Per_Medium_Type_codec.class);
  public static Units_Per_Medium_Type_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private Supply_Medium_Type_codec i_supply_medium_type_codec = Supply_Medium_Type_codec.getCodec();

  public synchronized static Units_Per_Medium_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Units_Per_Medium_Type_codec();
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
    Units_Per_Medium_Type_type retval = (Units_Per_Medium_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Units_Per_Medium_Type_type();
      }

      retval.medium = (java.math.BigInteger)sm.explicit_tag(i_supply_medium_type_codec, retval.medium, 128, 0, false, "medium");
      retval.no_of_units = (BigInteger)sm.explicit_tag(i_integer_codec, retval.no_of_units, 128, 1, false, "no_of_units");
      sm.sequenceEnd();
    }

    return retval;
  }

}
