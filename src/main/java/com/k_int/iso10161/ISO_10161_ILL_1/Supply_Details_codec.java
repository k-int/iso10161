package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class Supply_Details_codec extends base_codec
{
  private static Log log = LogFactory.getLog(Supply_Details_codec.class);
  public static Supply_Details_codec me = null;

  private Integer_codec i_integer_codec = Integer_codec.getCodec();
  private Date_Due_codec i_date_due_codec = Date_Due_codec.getCodec();
  private shipped_via_inline37_codec i_shipped_via_inline37_codec = shipped_via_inline37_codec.getCodec();
  private no_of_units_per_medium_inline38_codec i_no_of_units_per_medium_inline38_codec = no_of_units_per_medium_inline38_codec.getCodec();
  private ISO_Date_codec i_iso_date_codec = ISO_Date_codec.getCodec();
  private Amount_codec i_amount_codec = Amount_codec.getCodec();
  private Enumerated_codec i_enumerated_codec = Enumerated_codec.getCodec();

  public synchronized static Supply_Details_codec getCodec()
  {
    if ( me == null )
    {
      me = new Supply_Details_codec();
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
    Supply_Details_type retval = (Supply_Details_type)type_instance;

    if ( sm.sequenceBegin() )
    {

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
          retval = new Supply_Details_type();
      }

      retval.date_shipped = (java.lang.String)sm.implicit_tag(i_iso_date_codec, retval.date_shipped, 128, 0, true, "date_shipped");
      retval.date_due = (Date_Due_type)sm.implicit_tag(i_date_due_codec, retval.date_due, 128, 1, true, "date_due");
      retval.chargeable_units = (BigInteger)sm.implicit_tag(i_integer_codec, retval.chargeable_units, 128, 2, true, "chargeable_units");
      retval.cost = (Amount_type)sm.implicit_tag(i_amount_codec, retval.cost, 128, 3, true, "cost");
      retval.shipped_conditions = (BigInteger)sm.implicit_tag(i_enumerated_codec, retval.shipped_conditions, 128, 4, true, "shipped_conditions");
      retval.shipped_via = (shipped_via_inline37_type)i_shipped_via_inline37_codec.serialize(sm, retval.shipped_via,true, "shipped_via");
      retval.insured_for = (Amount_type)sm.implicit_tag(i_amount_codec, retval.insured_for, 128, 6, true, "insured_for");
      retval.return_insurance_require = (Amount_type)sm.implicit_tag(i_amount_codec, retval.return_insurance_require, 128, 7, true, "return_insurance_require");
      retval.no_of_units_per_medium = (java.util.Vector)sm.implicit_tag(i_no_of_units_per_medium_inline38_codec, retval.no_of_units_per_medium, 128, 8, true, "no_of_units_per_medium");
      sm.sequenceEnd();
    }

    return retval;
  }

}
