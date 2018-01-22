package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class ILL_APDU_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(ILL_APDU_type.class);
  public transient static final int ill_request_var_CID = 0;
  public transient static final int forward_notification_var_CID = 1;
  public transient static final int shipped_var_CID = 2;
  public transient static final int ill_answer_var_CID = 3;
  public transient static final int conditional_reply_var_CID = 4;
  public transient static final int cancel_var_CID = 5;
  public transient static final int cancel_reply_var_CID = 6;
  public transient static final int received_var_CID = 7;
  public transient static final int recall_var_CID = 8;
  public transient static final int returned_var_CID = 9;
  public transient static final int checked_in_var_CID = 10;
  public transient static final int overdue_var_CID = 11;
  public transient static final int renew_var_CID = 12;
  public transient static final int renew_answer_var_CID = 13;
  public transient static final int lost_var_CID = 14;
  public transient static final int damaged_var_CID = 15;
  public transient static final int message_var_CID = 16;
  public transient static final int status_query_var_CID = 17;
  public transient static final int status_or_error_report_var_CID = 18;
  public transient static final int expired_var_CID = 19;



    public ILL_APDU_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public ILL_APDU_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
