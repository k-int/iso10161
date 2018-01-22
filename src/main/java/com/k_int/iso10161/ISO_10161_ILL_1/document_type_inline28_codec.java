package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class document_type_inline28_codec extends base_codec
{
  private static Log log = LogFactory.getLog(document_type_inline28_codec.class);
  public static document_type_inline28_codec me = null;

  private Any_codec i_any_codec = Any_codec.getCodec();
  private OID_codec i_oid_codec = OID_codec.getCodec();

  public synchronized static document_type_inline28_codec getCodec()
  {
    if ( me == null )
    {
      me = new document_type_inline28_codec();
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
    document_type_inline28_type retval = (document_type_inline28_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new document_type_inline28_type();
      }

      retval.document_type_id = (int[])sm.implicit_tag(i_oid_codec, retval.document_type_id, 128, 2, false, "document_type_id");
      retval.document_type_parameters = (Object)sm.explicit_tag(i_any_codec, retval.document_type_parameters, 128, 3, false, "document_type_parameters");
      sm.sequenceEnd();
    }

    return retval;
  }

}
