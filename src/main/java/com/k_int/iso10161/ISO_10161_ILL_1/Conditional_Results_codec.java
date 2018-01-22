package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Conditional_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Conditional_Results_codec.class);
  public static Conditional_Results_codec me = null;

  private Delivery_Service_codec i_delivery_service_codec = Delivery_Service_codec.getCodec();
  private locations_inline23_codec i_locations_inline23_codec = locations_inline23_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Conditional_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Conditional_Results_codec();
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
    Conditional_Results_type retval = (Conditional_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Conditional_Results_type();
      }

      retval.conditions = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.conditions, 128, 0, false, "conditions");
      retval.date_for_reply = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_for_reply, 128, 1, true, "date_for_reply");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline23_codec, retval.locations, 128, 2, true, "locations");
      retval.proposed_delivery_service = (Delivery_Service_type)i_delivery_service_codec.serialize(sm, retval.proposed_delivery_service,true, "proposed_delivery_service");
      sm.sequenceEnd();
    }

    return retval;
  }

}
