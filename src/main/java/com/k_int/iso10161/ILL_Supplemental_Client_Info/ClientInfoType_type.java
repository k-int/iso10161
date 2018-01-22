package com.k_int.iso10161.ILL_Supplemental_Client_Info;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class ClientInfoType_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(ClientInfoType_type.class);
  public transient static final int standard_CID = 0;
  public transient static final int local_CID = 1;



    public ClientInfoType_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public ClientInfoType_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
