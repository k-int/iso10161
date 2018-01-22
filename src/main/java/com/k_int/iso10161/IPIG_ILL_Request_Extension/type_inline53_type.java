package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class type_inline53_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(type_inline53_type.class);
  public transient static final int visa_CID = 0;
  public transient static final int master_card_CID = 1;
  public transient static final int american_express_CID = 2;
  public transient static final int diners_club_CID = 3;
  public transient static final int other_CID = 4;



    public type_inline53_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public type_inline53_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
