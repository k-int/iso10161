package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Postal_Address_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Postal_Address_codec.class);
  public static Postal_Address_codec me = null;

  private Name_Of_Person_Or_Institution_codec i_name_of_person_or_institution_codec = Name_Of_Person_Or_Institution_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();

  public synchronized static Postal_Address_codec getCodec()
  {
    if ( me == null )
    {
      me = new Postal_Address_codec();
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
    Postal_Address_type retval = (Postal_Address_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Postal_Address_type();
      }

      retval.name_of_person_or_institution = (Name_Of_Person_Or_Institution_type)sm.explicit_tag(i_name_of_person_or_institution_codec, retval.name_of_person_or_institution, 128, 0, true, "name_of_person_or_institution");
      retval.extended_postal_delivery_address = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.extended_postal_delivery_address, 128, 1, true, "extended_postal_delivery_address");
      retval.street_and_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.street_and_number, 128, 2, true, "street_and_number");
      retval.post_office_box = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.post_office_box, 128, 3, true, "post_office_box");
      retval.city = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.city, 128, 4, true, "city");
      retval.region = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.region, 128, 5, true, "region");
      retval.country = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.country, 128, 6, true, "country");
      retval.postal_code = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.postal_code, 128, 7, true, "postal_code");
      sm.sequenceEnd();
    }

    return retval;
  }

}
