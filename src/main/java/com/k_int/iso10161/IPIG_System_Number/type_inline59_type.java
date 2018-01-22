package com.k_int.iso10161.IPIG_System_Number;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class type_inline59_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(type_inline59_type.class);
  public transient static final int well_known_CID = 0;
  public transient static final int other_CID = 1;



    public type_inline59_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public type_inline59_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
