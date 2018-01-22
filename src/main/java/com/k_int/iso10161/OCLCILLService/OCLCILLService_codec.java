package com.k_int.iso10161.OCLCILLService;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class OCLCILLService_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLCILLService_codec.class);
  public static OCLCILLService_codec me = null;

  private OCLCILLServiceType_codec i_oclcillservicetype_codec = OCLCILLServiceType_codec.getCodec();

  public synchronized static OCLCILLService_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLCILLService_codec();
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
    OCLCILLService_type retval = (OCLCILLService_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new OCLCILLService_type();
      }

      retval.oCLCILLServiceType = (java.math.BigInteger)sm.implicit_tag(i_oclcillservicetype_codec, retval.oCLCILLServiceType, 128, 0, false, "oCLCILLServiceType");
      sm.sequenceEnd();
    }

    return retval;
  }

}
