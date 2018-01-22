package com.k_int.iso10161.ILL_Supplemental_Client_Info;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class ClientInfoContent_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(ClientInfoContent_type.class);
  public transient static final int stringcontent_CID = 0;
  public transient static final int postaladdress_CID = 1;
  public transient static final int nameorid_CID = 2;
  public transient static final int statuscode_CID = 3;
  public transient static final int definednumber_CID = 4;
  public transient static final int nested_CID = 5;
  public transient static final int amount_CID = 6;



    public ClientInfoContent_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public ClientInfoContent_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
