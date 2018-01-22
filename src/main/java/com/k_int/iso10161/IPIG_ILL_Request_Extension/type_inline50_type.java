package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class type_inline50_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(type_inline50_type.class);
  public transient static final int phd_dissertation_CID = 0;
  public transient static final int masters_thesis_CID = 1;
  public transient static final int undergraduate_honors_thesis_CID = 2;
  public transient static final int other_CID = 3;



    public type_inline50_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public type_inline50_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
