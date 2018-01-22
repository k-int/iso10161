package com.k_int.iso10161.OCLCSpecificResults;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class ReasonInReviewListItem56_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ReasonInReviewListItem56_codec.class);
  public static ReasonInReviewListItem56_codec me = null;

  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private ReasonInReview_codec i_reasoninreview_codec = ReasonInReview_codec.getCodec();

  public synchronized static ReasonInReviewListItem56_codec getCodec()
  {
    if ( me == null )
    {
      me = new ReasonInReviewListItem56_codec();
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
    ReasonInReviewListItem56_type retval = (ReasonInReviewListItem56_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new ReasonInReviewListItem56_type();
      }

      retval.reasonInReview = (java.math.BigInteger)sm.implicit_tag(i_reasoninreview_codec, retval.reasonInReview, 128, 0, false, "reasonInReview");
      retval.reasonInReviewText = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.reasonInReviewText, 128, 1, true, "reasonInReviewText");
      sm.sequenceEnd();
    }

    return retval;
  }

}
