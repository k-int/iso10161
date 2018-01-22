package com.k_int.iso10161.ISO_10161_ILL_1;

// For logging
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.math.BigInteger;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

public class ILL_APDU_codec extends base_codec
{
  private static Log log = LogFactory.getLog(ILL_APDU_codec.class);
  public static ILL_APDU_codec me = null;


  private static Object[][] choice_info = { 
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), ILL_Request_codec.getCodec() , "ILL_Request_var", new Integer(0) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Forward_Notification_codec.getCodec() , "Forward_Notification_var", new Integer(1) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Shipped_codec.getCodec() , "Shipped_var", new Integer(2) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), ILL_Answer_codec.getCodec() , "ILL_Answer_var", new Integer(3) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Conditional_Reply_codec.getCodec() , "Conditional_Reply_var", new Integer(4) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Cancel_codec.getCodec() , "Cancel_var", new Integer(5) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Cancel_Reply_codec.getCodec() , "Cancel_Reply_var", new Integer(6) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Received_codec.getCodec() , "Received_var", new Integer(7) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Recall_codec.getCodec() , "Recall_var", new Integer(8) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Returned_codec.getCodec() , "Returned_var", new Integer(9) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Checked_In_codec.getCodec() , "Checked_In_var", new Integer(10) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Overdue_codec.getCodec() , "Overdue_var", new Integer(11) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Renew_codec.getCodec() , "Renew_var", new Integer(12) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Renew_Answer_codec.getCodec() , "Renew_Answer_var", new Integer(13) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Lost_codec.getCodec() , "Lost_var", new Integer(14) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Damaged_codec.getCodec() , "Damaged_var", new Integer(15) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Message_codec.getCodec() , "Message_var", new Integer(16) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Status_Query_codec.getCodec() , "Status_Query_var", new Integer(17) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Status_Or_Error_Report_codec.getCodec() , "Status_Or_Error_Report_var", new Integer(18) },
    { SerializationManager.TAGMODE_NONE, new Integer(-1), new Integer(-1), Expired_codec.getCodec() , "Expired_var", new Integer(19) }
  };

  public synchronized static ILL_APDU_codec getCodec()
  {
    if ( me == null )
    {
      me = new ILL_APDU_codec();

    }
    return me;
  }

  public Object serialize(SerializationManager sm,
                          Object type_instance,
                          boolean is_optional,
                          String type_name) throws java.io.IOException
  {
    ILL_APDU_type retval = (ILL_APDU_type)type_instance;

      if ( sm.getDirection() == SerializationManager.DIRECTION_DECODE )
      {
        retval = new ILL_APDU_type();
        retval = (ILL_APDU_type)sm.choice(retval, choice_info, type_name);
      }
      else
      {
        if ( retval != null )
          sm.choice(retval, choice_info, type_name);
      }

      if ( ( retval==null ) && ( !is_optional ) )
      {
        log.info("Missing mandatory choice for "+type_name);
      }

    return retval;
  }

}
