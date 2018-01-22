package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class System_Id_codec extends base_codec
{
  private static Log log = LogFactory.getLog(System_Id_codec.class);
  public static System_Id_codec me = null;

  private Person_Or_Institution_Symbol_codec i_person_or_institution_symbol_codec = Person_Or_Institution_Symbol_codec.getCodec();
  private Name_Of_Person_Or_Institution_codec i_name_of_person_or_institution_codec = Name_Of_Person_Or_Institution_codec.getCodec();

  public synchronized static System_Id_codec getCodec()
  {
    if ( me == null )
    {
      me = new System_Id_codec();
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
    System_Id_type retval = (System_Id_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new System_Id_type();
      }

      retval.person_or_institution_symbol = (Person_Or_Institution_Symbol_type)sm.explicit_tag(i_person_or_institution_symbol_codec, retval.person_or_institution_symbol, 128, 0, true, "person_or_institution_symbol");
      retval.name_of_person_or_institution = (Name_Of_Person_Or_Institution_type)sm.explicit_tag(i_name_of_person_or_institution_codec, retval.name_of_person_or_institution, 128, 1, true, "name_of_person_or_institution");
      sm.sequenceEnd();
    }

    return retval;
  }

}
