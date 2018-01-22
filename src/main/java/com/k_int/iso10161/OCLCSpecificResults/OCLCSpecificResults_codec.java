package com.k_int.iso10161.OCLCSpecificResults;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class OCLCSpecificResults_codec extends base_codec
{
  private static Log log = LogFactory.getLog(OCLCSpecificResults_codec.class);
  public static OCLCSpecificResults_codec me = null;

  private ReasonInReviewList_codec i_reasoninreviewlist_codec = ReasonInReviewList_codec.getCodec();
  private OCLCSpecificStatus_codec i_oclcspecificstatus_codec = OCLCSpecificStatus_codec.getCodec();

  public synchronized static OCLCSpecificResults_codec getCodec()
  {
    if ( me == null )
    {
      me = new OCLCSpecificResults_codec();
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
    OCLCSpecificResults_type retval = (OCLCSpecificResults_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new OCLCSpecificResults_type();
      }

      retval.oclcSpecificStatus = (java.math.BigInteger)sm.implicit_tag(i_oclcspecificstatus_codec, retval.oclcSpecificStatus, 128, 0, false, "oclcSpecificStatus");
      retval.reasonInReviewList = (java.util.Vector)sm.implicit_tag(i_reasoninreviewlist_codec, retval.reasonInReviewList, 128, 1, true, "reasonInReviewList");
      sm.sequenceEnd();
    }

    return retval;
  }

}
