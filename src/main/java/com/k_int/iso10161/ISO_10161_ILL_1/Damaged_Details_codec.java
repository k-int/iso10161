package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Damaged_Details_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Damaged_Details_codec.class);
  public static Damaged_Details_codec me = null;

  private OID_codec i_oid_codec = OID_codec.getCodec();
  private damaged_portion_inline24_codec i_damaged_portion_inline24_codec = damaged_portion_inline24_codec.getCodec();

  public synchronized static Damaged_Details_codec getCodec()
  {
    if ( me == null )
    {
      me = new Damaged_Details_codec();
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
    Damaged_Details_type retval = (Damaged_Details_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Damaged_Details_type();
      }

      retval.document_type_id = (int[])sm.implicit_tag(i_oid_codec, retval.document_type_id, 128, 0, true, "document_type_id");
      retval.damaged_portion = (damaged_portion_inline24_type)i_damaged_portion_inline24_codec.serialize(sm, retval.damaged_portion,false, "damaged_portion");
      sm.sequenceEnd();
    }

    return retval;
  }

}
