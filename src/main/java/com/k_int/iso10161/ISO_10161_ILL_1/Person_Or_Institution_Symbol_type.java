package com.k_int.iso10161.ISO_10161_ILL_1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.Serializable;
import com.k_int.codec.runtime.*;

public class Person_Or_Institution_Symbol_type extends ChoiceType implements Serializable 
{
  private transient static LoggingContext log = LogFactory.getLog(Person_Or_Institution_Symbol_type.class);
  public transient static final int person_symbol_CID = 0;
  public transient static final int institution_symbol_CID = 1;



    public Person_Or_Institution_Symbol_type(int which, Object o)
    {
      this.which = which;
      this.o = o;
    }

    public Person_Or_Institution_Symbol_type() {}



    public String toString()
    {
      return this.o.toString();
    }



}
