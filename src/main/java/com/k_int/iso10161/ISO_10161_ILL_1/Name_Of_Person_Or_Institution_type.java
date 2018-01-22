package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Name_Of_Person_Or_Institution_type extends ChoiceType implements Serializable 
{
  private transient static Log log = LogFactory.getLog(Name_Of_Person_Or_Institution_type.class);
  public transient static final int name_of_person_CID = 0;
  public transient static final int name_of_institution_CID = 1;



    public Name_Of_Person_Or_Institution_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Name_Of_Person_Or_Institution_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
