package com.k_int.iso10160;

import com.k_int.iso10161.ISO_10161_ILL_1.*;


public class ISO10161DataBinder {
  
  public ILL_APDU_type toISO(Map message_data) {
    ILL_APDU_type result = (ILL_APDU_type) internlBind(ILL_APDU_type.class, message_data);
    return result;
  }

  public Object internalBind(Class context, Map message_data) {
    // If context is a subclass of ChoiceType create a new instance of choice type
    // and then bind the child object type...
    return context.newInstance();
  }
  
  public Object bindChoice(Map message_data) {
    // Set o and which
    return null;
  }
}
