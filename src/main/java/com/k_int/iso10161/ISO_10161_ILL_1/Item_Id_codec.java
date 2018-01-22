package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Item_Id_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Item_Id_codec.class);
  public static Item_Id_codec me = null;

  private Medium_Type_codec i_medium_type_codec = Medium_Type_codec.getCodec();
  private ILL_String_codec i_ill_string_codec = ILL_String_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();
  private EXTERNAL_codec i_external_codec = EXTERNAL_codec.getCodec();

  public synchronized static Item_Id_codec getCodec()
  {
    if ( me == null )
    {
      me = new Item_Id_codec();
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
    Item_Id_type retval = (Item_Id_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Item_Id_type();
      }

      retval.item_type = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.item_type, 128, 0, true, "item_type");
      retval.held_medium_type = (java.math.BigInteger)sm.implicit_tag(i_medium_type_codec, retval.held_medium_type, 128, 1, true, "held_medium_type");
      retval.call_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.call_number, 128, 2, true, "call_number");
      retval.author = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.author, 128, 3, true, "author");
      retval.title = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.title, 128, 4, true, "title");
      retval.sub_title = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.sub_title, 128, 5, true, "sub_title");
      retval.sponsoring_body = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.sponsoring_body, 128, 6, true, "sponsoring_body");
      retval.place_of_publication = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.place_of_publication, 128, 7, true, "place_of_publication");
      retval.publisher = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.publisher, 128, 8, true, "publisher");
      retval.series_title_number = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.series_title_number, 128, 9, true, "series_title_number");
      retval.volume_issue = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.volume_issue, 128, 10, true, "volume_issue");
      retval.edition = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.edition, 128, 11, true, "edition");
      retval.publication_date = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.publication_date, 128, 12, true, "publication_date");
      retval.publication_date_of_component = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.publication_date_of_component, 128, 13, true, "publication_date_of_component");
      retval.author_of_article = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.author_of_article, 128, 14, true, "author_of_article");
      retval.title_of_article = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.title_of_article, 128, 15, true, "title_of_article");
      retval.pagination = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.pagination, 128, 16, true, "pagination");
      retval.national_bibliography_no = (EXTERNAL_type)sm.explicit_tag(i_external_codec, retval.national_bibliography_no, 128, 17, true, "national_bibliography_no");
      retval.iSBN = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.iSBN, 128, 18, true, "iSBN");
      retval.iSSN = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.iSSN, 128, 19, true, "iSSN");
      retval.system_no = (EXTERNAL_type)sm.explicit_tag(i_external_codec, retval.system_no, 128, 20, true, "system_no");
      retval.additional_no_letters = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.additional_no_letters, 128, 21, true, "additional_no_letters");
      retval.verification_reference_source = (ILL_String_type)sm.explicit_tag(i_ill_string_codec, retval.verification_reference_source, 128, 22, true, "verification_reference_source");
      sm.sequenceEnd();
    }

    return retval;
  }

}
