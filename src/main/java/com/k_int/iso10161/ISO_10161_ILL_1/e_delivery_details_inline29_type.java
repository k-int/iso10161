package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class e_delivery_details_inline29_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(e_delivery_details_inline29_type.class);
  public transient static final int e_delivery_address_CID = 0;
  public transient static final int e_delivery_id_CID = 1;



    public e_delivery_details_inline29_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public e_delivery_details_inline29_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
