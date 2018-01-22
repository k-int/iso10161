package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : History_Report_type 
 *  @author Auto generated bu A2J
 */ 
public class History_Report_type implements Serializable 
{
    /** Optional member */
    public java.lang.String date_requested = null;
    /** Optional member */
    public ILL_String_type author = null;
    /** Optional member */
    public ILL_String_type title = null;
    /** Optional member */
    public ILL_String_type author_of_article = null;
    /** Optional member */
    public ILL_String_type title_of_article = null;
    /** Mandatory member */
    public java.lang.String date_of_last_transition = null;
    /** Mandatory member */
    public BigInteger most_recent_service = null;
    /** Mandatory member */
    public java.lang.String date_of_most_recent_service = null;
    /** Mandatory member */
    public System_Id_type initiator_of_most_recent_service = null;
    /** Optional member */
    public java.math.BigInteger shipped_service_type = null;
    /** Optional member */
    public java.math.BigInteger transaction_results = null;
    /** Optional member */
    public ILL_String_type most_recent_service_note = null;


    public History_Report_type(java.lang.String date_requested,
      ILL_String_type author,
      ILL_String_type title,
      ILL_String_type author_of_article,
      ILL_String_type title_of_article,
      java.lang.String date_of_last_transition,
      BigInteger most_recent_service,
      java.lang.String date_of_most_recent_service,
      System_Id_type initiator_of_most_recent_service,
      java.math.BigInteger shipped_service_type,
      java.math.BigInteger transaction_results,
      ILL_String_type most_recent_service_note)
    {
        this.date_requested=date_requested;
        this.author=author;
        this.title=title;
        this.author_of_article=author_of_article;
        this.title_of_article=title_of_article;
        this.date_of_last_transition=date_of_last_transition;
        this.most_recent_service=most_recent_service;
        this.date_of_most_recent_service=date_of_most_recent_service;
        this.initiator_of_most_recent_service=initiator_of_most_recent_service;
        this.shipped_service_type=shipped_service_type;
        this.transaction_results=transaction_results;
        this.most_recent_service_note=most_recent_service_note;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("date_requested"=date_requested);
        sw.write("author"=author);
        sw.write("title"=title);
        sw.write("author_of_article"=author_of_article);
        sw.write("title_of_article"=title_of_article);
        sw.write("date_of_last_transition"=date_of_last_transition);
        sw.write("most_recent_service"=most_recent_service);
        sw.write("date_of_most_recent_service"=date_of_most_recent_service);
        sw.write("initiator_of_most_recent_service"=initiator_of_most_recent_service);
        sw.write("shipped_service_type"=shipped_service_type);
        sw.write("transaction_results"=transaction_results);
        sw.write("most_recent_service_note"=most_recent_service_note);
        sw.write("\n}\n");
        return sw.toString();
    }

    public History_Report_type() {}


}
