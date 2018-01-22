package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class History_Report_codec extends base_codec
{
  private static Log log = LogFactory.getLog(History_Report_codec.class);
  public static History_Report_codec me = null;

  private Shipped_Service_Type_codec i_shipped_service_type_codec = Shipped_Service_Type_codec.getCodec();
  private System_Id_codec i_system_id_codec = System_Id_codec.getCodec();
  private Transaction_Results_codec i_transaction_results_codec = Transaction_Results_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static History_Report_codec getCodec()
  {
    if ( me == null )
    {
      me = new History_Report_codec();
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
    History_Report_type retval = (History_Report_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new History_Report_type();
      }

      retval.date_requested = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_requested, 128, 0, true, "date_requested");
      retval.author = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.author, 128, 1, true, "author");
      retval.title = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.title, 128, 2, true, "title");
      retval.author_of_article = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.author_of_article, 128, 3, true, "author_of_article");
      retval.title_of_article = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.title_of_article, 128, 4, true, "title_of_article");
      retval.date_of_last_transition = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_of_last_transition, 128, 5, false, "date_of_last_transition");
      retval.most_recent_service = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.most_recent_service, 128, 6, false, "most_recent_service");
      retval.date_of_most_recent_service = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_of_most_recent_service, 128, 7, false, "date_of_most_recent_service");
      retval.initiator_of_most_recent_service = (System_Id_type)sm.implicit_tag(i_system_id_codec, retval.initiator_of_most_recent_service, 128, 8, false, "initiator_of_most_recent_service");
      retval.shipped_service_type = (java.math.BigInteger)sm.implicit_tag(i_shipped_service_type_codec, retval.shipped_service_type, 128, 9, true, "shipped_service_type");
      retval.transaction_results = (java.math.BigInteger)sm.implicit_tag(i_transaction_results_codec, retval.transaction_results, 128, 10, true, "transaction_results");
      retval.most_recent_service_note = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.most_recent_service_note, 128, 11, true, "most_recent_service_note");
      sm.sequenceEnd();
    }

    return retval;
  }

}
