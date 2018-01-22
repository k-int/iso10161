package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Provider_Error_Report_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(Provider_Error_Report_type.class);
  public transient static final int general_problem_CID = 0;
  public transient static final int transaction_id_problem_CID = 1;
  public transient static final int state_transition_prohibited_CID = 2;



    public Provider_Error_Report_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Provider_Error_Report_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
