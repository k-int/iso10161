package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class status_or_error_report_extensions_inline21_codec extends base_codec
{
  private static Log log = LogFactory.getLog(status_or_error_report_extensions_inline21_codec.class);
  public static status_or_error_report_extensions_inline21_codec me = null;

  private Extension_codec i_extension_codec = Extension_codec.getCodec();

  public synchronized static status_or_error_report_extensions_inline21_codec getCodec()
  {
    if ( me == null )
    {
      me = new status_or_error_report_extensions_inline21_codec();
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

        retval = sm.sequenceOf(retval, i_extension_codec);

        sm.sequenceEnd();
      }

    }
    return retval;
  }

}
