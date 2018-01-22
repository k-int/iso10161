package com.k_int.iso10161.Intermediary_Control;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class resultsExplanation_inline57_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(resultsExplanation_inline57_type.class);
  public transient static final int conditionalresults_CID = 0;
  public transient static final int retryresults_CID = 1;
  public transient static final int unfilledresults_CID = 2;
  public transient static final int locationsresults_CID = 3;
  public transient static final int willsupplyresults_CID = 4;
  public transient static final int holdplacedresults_CID = 5;
  public transient static final int estimateresults_CID = 6;



    public resultsExplanation_inline57_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public resultsExplanation_inline57_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
