package com.k_int.iso10161.IPIG_ILL_Request_Extension;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_codec;
import com.k_int.iso10161.ISO_10161_ILL_1.ILL_String_type;
public class IPIG_ILL_Request_Extension_choice49_codec extends base_codec
{
  private static Log log = LogFactory.getLog(IPIG_ILL_Request_Extension_choice49_codec.class);
  public static IPIG_ILL_Request_Extension_choice49_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(0), ILL_String_codec.getCodec() , "uniform_title", new Integer(0) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(1), Requested_Material_Format_codec.getCodec() , "material_type", new Integer(1) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(2), ILL_String_codec.getCodec() , "responder_specific_info", new Integer(2) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(3), Dissertation_Thesis_codec.getCodec() , "dissertation_thesis", new Integer(3) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(4), ILL_String_codec.getCodec() , "volume", new Integer(4) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(5), ILL_String_codec.getCodec() , "issue_number", new Integer(5) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(6), ILL_String_codec.getCodec() , "affiliations", new Integer(6) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(7), Item_Language_codec.getCodec() , "requested_material_language", new Integer(7) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(8), ILL_String_codec.getCodec() , "form_content_info", new Integer(8) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(9), Payment_Type_codec.getCodec() , "payment_method", new Integer(9) },
    { SerializationManager.IMPLICIT, new Integer(128), new Integer(10), NULL_codec.getCodec() , "this_edition_only", new Integer(10) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(11), ILL_String_codec.getCodec() , "unique_item_iD", new Integer(11) },
    { SerializationManager.EXPLICIT,new Integer(128), new Integer(12), Rights_Information_codec.getCodec() , "rights_info", new Integer(12) }
  };

  public synchronized static IPIG_ILL_Request_Extension_choice49_codec getCodec()
  {
    if ( me == null )
    {
      me = new IPIG_ILL_Request_Extension_choice49_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    IPIG_ILL_Request_Extension_choice49_type retval = (IPIG_ILL_Request_Extension_choice49_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new IPIG_ILL_Request_Extension_choice49_type();
        retval = (IPIG_ILL_Request_Extension_choice49_type)sm.choice(retval, choice_info, type_name);
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
