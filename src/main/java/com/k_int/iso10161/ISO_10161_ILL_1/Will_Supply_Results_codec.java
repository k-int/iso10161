package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Will_Supply_Results_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Will_Supply_Results_codec.class);
  public static Will_Supply_Results_codec me = null;

  private Electronic_Delivery_Service_codec i_electronic_delivery_service_codec = Electronic_Delivery_Service_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private locations_inline40_codec i_locations_inline40_codec = locations_inline40_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();
  private Postal_Address_codec i_postal_address_codec = Postal_Address_codec.getCodec();

  public synchronized static Will_Supply_Results_codec getCodec()
  {
    if ( me == null )
    {
      me = new Will_Supply_Results_codec();
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
    Will_Supply_Results_type retval = (Will_Supply_Results_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Will_Supply_Results_type();
      }

      retval.reason_will_supply = (BigInteger)sm.explicit_tag(i_enumerated_codec, retval.reason_will_supply, 128, 0, false, "reason_will_supply");
      retval.supply_date = (java.lang.String)sm.explicit_tag(i_iso_date_codec, retval.supply_date, 128, 1, true, "supply_date");
      retval.return_to_address = (Postal_Address_type)sm.explicit_tag(i_postal_address_codec, retval.return_to_address, 128, 2, true, "return_to_address");
      retval.locations = (java.util.Vector)sm.implicit_tag(i_locations_inline40_codec, retval.locations, 128, 3, true, "locations");
      retval.electronic_delivery_service = (Electronic_Delivery_Service_type)sm.explicit_tag(i_electronic_delivery_service_codec, retval.electronic_delivery_service, 128, 4, true, "electronic_delivery_service");
      sm.sequenceEnd();
    }

    return retval;
  }

}
