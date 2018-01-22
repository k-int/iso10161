package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class ILL_String_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(ILL_String_type.class);
  public transient static final int generalstring_var_CID = 0;
  public transient static final int edifactstring_var_CID = 1;



    public ILL_String_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public ILL_String_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
