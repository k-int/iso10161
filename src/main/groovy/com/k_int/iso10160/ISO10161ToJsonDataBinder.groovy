package com.k_int.iso10160;

import com.k_int.iso10161.ISO_10161_ILL_1.*;


public class ISO10161ToJsonDataBinder {

  /**
   * Accept an ILL APDU and convert to a JSON object which is a mirror of the JSON created by
   * ISO10161DataBinder
   * See src/test/groovy/com/k_int/iso10161/ProtocolTest.groovy for example messages.
   */
  public static Map toJson(ILL_APDU_type apdu) {
    Map result = new java.util.HashMap();

    return result;
  }

}
