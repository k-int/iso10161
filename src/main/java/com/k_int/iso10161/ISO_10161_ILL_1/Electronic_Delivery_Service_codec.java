package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Electronic_Delivery_Service_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Electronic_Delivery_Service_codec.class);
  public static Electronic_Delivery_Service_codec me = null;

  private e_delivery_service_inline27_codec i_e_delivery_service_inline27_codec = e_delivery_service_inline27_codec.getCodec();
  private document_type_inline28_codec i_document_type_inline28_codec = document_type_inline28_codec.getCodec();
  private e_delivery_details_inline29_codec i_e_delivery_details_inline29_codec = e_delivery_details_inline29_codec.getCodec();
  private ISO_Time_codec i_iso_time_codec = ISO_Time_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Electronic_Delivery_Service_codec getCodec()
  {
    if ( me == null )
    {
      me = new Electronic_Delivery_Service_codec();
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
    Electronic_Delivery_Service_type retval = (Electronic_Delivery_Service_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Electronic_Delivery_Service_type();
      }

      retval.e_delivery_service = (e_delivery_service_inline27_type)sm.implicit_tag(i_e_delivery_service_inline27_codec, retval.e_delivery_service, 128, 0, true, "e_delivery_service");
      retval.document_type = (document_type_inline28_type)sm.implicit_tag(i_document_type_inline28_codec, retval.document_type, 128, 1, true, "document_type");
      retval.e_delivery_description = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.e_delivery_description, 128, 4, true, "e_delivery_description");
      retval.e_delivery_details = (e_delivery_details_inline29_type)sm.explicit_tag(i_e_delivery_details_inline29_codec, retval.e_delivery_details, 128, 5, false, "e_delivery_details");
      retval.name_or_code = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.name_or_code, 128, 6, true, "name_or_code");
      retval.delivery_time = (java.lang.String)sm.implicit_tag(i_iso_time_codec, retval.delivery_time, 128, 7, true, "delivery_time");
      sm.sequenceEnd();
    }

    return retval;
  }

}
