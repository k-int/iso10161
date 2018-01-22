package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class User_Error_Report_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(User_Error_Report_type.class);
  public transient static final int already_forwarded_CID = 0;
  public transient static final int intermediary_problem_CID = 1;
  public transient static final int security_problem_CID = 2;
  public transient static final int unable_to_perform_CID = 3;



    public User_Error_Report_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public User_Error_Report_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
