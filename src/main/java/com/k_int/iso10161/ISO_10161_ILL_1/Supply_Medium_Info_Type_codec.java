package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Supply_Medium_Info_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Supply_Medium_Info_Type_codec.class);
  public static Supply_Medium_Info_Type_codec me = null;

  private Supply_Medium_Type_codec i_supply_medium_type_codec = Supply_Medium_Type_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Supply_Medium_Info_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Supply_Medium_Info_Type_codec();
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
    Supply_Medium_Info_Type_type retval = (Supply_Medium_Info_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Supply_Medium_Info_Type_type();
      }

      retval.supply_medium_type = (java.math.BigInteger)sm.implicit_tag(i_supply_medium_type_codec, retval.supply_medium_type, 128, 0, false, "supply_medium_type");
      retval.medium_characteristics = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.medium_characteristics, 128, 1, true, "medium_characteristics");
      sm.sequenceEnd();
    }

    return retval;
  }

}
