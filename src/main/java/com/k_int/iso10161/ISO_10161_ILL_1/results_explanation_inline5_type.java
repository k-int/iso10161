package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class results_explanation_inline5_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(results_explanation_inline5_type.class);
  public transient static final int conditional_results_CID = 0;
  public transient static final int retry_results_CID = 1;
  public transient static final int unfilled_results_CID = 2;
  public transient static final int locations_results_CID = 3;
  public transient static final int will_supply_results_CID = 4;
  public transient static final int hold_placed_results_CID = 5;
  public transient static final int estimate_results_CID = 6;



    public results_explanation_inline5_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public results_explanation_inline5_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
