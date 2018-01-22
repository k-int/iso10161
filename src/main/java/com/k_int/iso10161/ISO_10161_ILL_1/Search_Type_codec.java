package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Search_Type_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Search_Type_codec.class);
  public static Search_Type_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Search_Type_codec getCodec()
  {
    if ( me == null )
    {
      me = new Search_Type_codec();
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
    Search_Type_type retval = (Search_Type_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Search_Type_type();
      }

      retval.level_of_service = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.level_of_service, 128, 0, true, "level_of_service");
      retval.need_before_date = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.need_before_date, 128, 1, true, "need_before_date");
      retval.expiry_flag = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.expiry_flag, 128, 2, false, "expiry_flag");
      retval.expiry_date = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.expiry_date, 128, 3, true, "expiry_date");
      sm.sequenceEnd();
    }

    return retval;
  }

}
