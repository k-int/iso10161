package com.k_int.iso10161.IPIG_ILL_Request_Extension;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class IPIG_ILL_Request_Extension_choice49_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(IPIG_ILL_Request_Extension_choice49_type.class);
  public transient static final int uniform_title_CID = 0;
  public transient static final int material_type_CID = 1;
  public transient static final int responder_specific_info_CID = 2;
  public transient static final int dissertation_thesis_CID = 3;
  public transient static final int volume_CID = 4;
  public transient static final int issue_number_CID = 5;
  public transient static final int affiliations_CID = 6;
  public transient static final int requested_material_language_CID = 7;
  public transient static final int form_content_info_CID = 8;
  public transient static final int payment_method_CID = 9;
  public transient static final int this_edition_only_CID = 10;
  public transient static final int unique_item_id_CID = 11;
  public transient static final int rights_info_CID = 12;



    public IPIG_ILL_Request_Extension_choice49_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public IPIG_ILL_Request_Extension_choice49_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
