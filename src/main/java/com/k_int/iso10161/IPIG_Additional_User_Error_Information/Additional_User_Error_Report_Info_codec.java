package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Additional_User_Error_Report_Info_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Additional_User_Error_Report_Info_codec.class);
  public static Additional_User_Error_Report_Info_codec me = null;

  private Additional_User_Error_Report_Info_choice48_codec i_additional_user_error_report_info_choice48_codec = Additional_User_Error_Report_Info_choice48_codec.getCodec();

  public synchronized static Additional_User_Error_Report_Info_codec getCodec()
  {
    if ( me == null )
    {
      me = new Additional_User_Error_Report_Info_codec();
    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    java.util.Vector retval = (java.util.Vector)type_instance;

    if ( ( ( sm.getDirection() == SerializationManager.DIRECTION_ENCODE ) && ( retval != null ) ) ||
         ( sm.getDirection() == SerializationManager.DIRECTION_DECODE ) )
    {
      if ( sm.sequenceBegin() )
      {
        if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
        {
            retval = new java.util.Vector();
        }

        retval = sm.sequenceOf(retval, i_additional_user_error_report_info_choice48_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
