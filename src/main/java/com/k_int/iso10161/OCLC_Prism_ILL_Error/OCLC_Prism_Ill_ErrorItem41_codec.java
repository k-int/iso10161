package com.k_int.iso10161.OCLC_Prism_ILL_Error;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class OCLC_Prism_Ill_ErrorItem41_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLC_Prism_Ill_ErrorItem41_codec.class);
  public static OCLC_Prism_Ill_ErrorItem41_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static OCLC_Prism_Ill_ErrorItem41_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLC_Prism_Ill_ErrorItem41_codec();
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
    OCLC_Prism_Ill_ErrorItem41_type retval = (OCLC_Prism_Ill_ErrorItem41_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new OCLC_Prism_Ill_ErrorItem41_type();
      }

      retval.prism_Ill_Field_Id = (BigInteger)sm.implicit_tag(i_integer_codec, retval.prism_Ill_Field_Id, 128, 0, true, "prism_Ill_Field_Id");
      retval.prism_Ill_Error_Code = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.prism_Ill_Error_Code, 128, 1, true, "prism_Ill_Error_Code");
      retval.prism_Ill_Error_Text = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.prism_Ill_Error_Text, 128, 2, true, "prism_Ill_Error_Text");
      sm.sequenceEnd();
    }

    return retval;
  }

}
