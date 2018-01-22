package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Payment_Type_choice51_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(Payment_Type_choice51_type.class);
  public transient static final int reciprocal_agreement_CID = 0;
  public transient static final int prepaid_CID = 1;
  public transient static final int unesco_voucher_CID = 2;
  public transient static final int alia_voucher_CID = 3;
  public transient static final int ifla_voucher_CID = 4;
  public transient static final int other_voucher_or_coupon_CID = 5;
  public transient static final int rlg_shares_CID = 6;
  public transient static final int oclc_ifm_CID = 7;
  public transient static final int other_payment_scheme_CID = 8;
  public transient static final int cash_CID = 9;
  public transient static final int check_CID = 10;
  public transient static final int credit_card_CID = 11;
  public transient static final int deposit_account_CID = 12;
  public transient static final int bank_electronic_payment_CID = 13;
  public transient static final int other_payment_type_CID = 14;



    public Payment_Type_choice51_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Payment_Type_choice51_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
