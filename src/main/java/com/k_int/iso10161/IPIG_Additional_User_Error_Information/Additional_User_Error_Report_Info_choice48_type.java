package com.k_int.iso10161.IPIG_Additional_User_Error_Information;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Additional_User_Error_Report_Info_choice48_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(Additional_User_Error_Report_Info_choice48_type.class);
  public transient static final int element_truncated_CID = 0;
  public transient static final int missing_required_element_CID = 1;
  public transient static final int unsupported_field_length_CID = 2;
  public transient static final int unrecognized_data_CID = 3;
  public transient static final int inconsistent_data_CID = 4;
  public transient static final int other_CID = 5;



    public Additional_User_Error_Report_Info_choice48_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Additional_User_Error_Report_Info_choice48_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
