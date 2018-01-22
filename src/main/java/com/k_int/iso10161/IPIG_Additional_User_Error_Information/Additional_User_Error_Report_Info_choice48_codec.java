package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class Additional_User_Error_Report_Info_choice48_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Additional_User_Error_Report_Info_choice48_codec.class);
  public static Additional_User_Error_Report_Info_choice48_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(4), Element_Truncated_codec.getCodec() , "element_truncated", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(5), Identifier_codec.getCodec() , "missing_required_element", new Integer(1) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(6), Unsupported_Field_Length_codec.getCodec() , "unsupported_field_length", new Integer(2) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(7), Unrecognized_Data_codec.getCodec() , "unrecognized_data", new Integer(3) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(8), ILL_String_codec.getCodec() , "inconsistent_data", new Integer(4) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(9), ILL_String_codec.getCodec() , "other", new Integer(5) }
  };

  public synchronized static Additional_User_Error_Report_Info_choice48_codec getCodec()
  {
    if ( me == null )
    {
      me = new Additional_User_Error_Report_Info_choice48_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    Additional_User_Error_Report_Info_choice48_type retval = (Additional_User_Error_Report_Info_choice48_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new Additional_User_Error_Report_Info_choice48_type();
        retval = (Additional_User_Error_Report_Info_choice48_type)sm.choice(retval, choice_info, type_name);
      }
      else
      {
        if ( retval != null )
          sm.choice(retval, choice_info, type_name);
      }

      if ( ( retval==null ) && ( !is_optional ) )
      {
        log.info("Missing mandatory choice for "+type_name);
      }

    return retval;
  }

}
