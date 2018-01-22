package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class damaged_portion_inline24_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(damaged_portion_inline24_type.class);
  public transient static final int complete_document_CID = 0;
  public transient static final int specific_units_CID = 1;



    public damaged_portion_inline24_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public damaged_portion_inline24_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
