package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Delivery_Service_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(Delivery_Service_type.class);
  public transient static final int physical_delivery_CID = 0;
  public transient static final int electronic_delivery_CID = 1;



    public Delivery_Service_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Delivery_Service_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
