package com.k_int.iso10161.ISO_10161_ILL_1;

import java.math.BigInteger;
import java.util.Vector;
import java.io.Serializable;
import com.k_int.codec.runtime.*;
import com.k_int.gen.AsnUseful.*;

/** A Java holder for the ASN type : Item_Id_type 
 *  @author Auto generated bu A2J
 */ 
public class Item_Id_type implements Serializable 
{
    /** Optional member */
    public BigInteger item_type = null;
    /** Optional member */
    public java.math.BigInteger held_medium_type = null;
    /** Optional member */
    public ILL_String_type call_number = null;
    /** Optional member */
    public ILL_String_type author = null;
    /** Optional member */
    public ILL_String_type title = null;
    /** Optional member */
    public ILL_String_type sub_title = null;
    /** Optional member */
    public ILL_String_type sponsoring_body = null;
    /** Optional member */
    public ILL_String_type place_of_publication = null;
    /** Optional member */
    public ILL_String_type publisher = null;
    /** Optional member */
    public ILL_String_type series_title_number = null;
    /** Optional member */
    public ILL_String_type volume_issue = null;
    /** Optional member */
    public ILL_String_type edition = null;
    /** Optional member */
    public ILL_String_type publication_date = null;
    /** Optional member */
    public ILL_String_type publication_date_of_component = null;
    /** Optional member */
    public ILL_String_type author_of_article = null;
    /** Optional member */
    public ILL_String_type title_of_article = null;
    /** Optional member */
    public ILL_String_type pagination = null;
    /** Optional member */
    public EXTERNAL_type national_bibliography_no = null;
    /** Optional member */
    public ILL_String_type iSBN = null;
    /** Optional member */
    public ILL_String_type iSSN = null;
    /** Optional member */
    public EXTERNAL_type system_no = null;
    /** Optional member */
    public ILL_String_type additional_no_letters = null;
    /** Optional member */
    public ILL_String_type verification_reference_source = null;


    public Item_Id_type(BigInteger item_type,
      java.math.BigInteger held_medium_type,
      ILL_String_type call_number,
      ILL_String_type author,
      ILL_String_type title,
      ILL_String_type sub_title,
      ILL_String_type sponsoring_body,
      ILL_String_type place_of_publication,
      ILL_String_type publisher,
      ILL_String_type series_title_number,
      ILL_String_type volume_issue,
      ILL_String_type edition,
      ILL_String_type publication_date,
      ILL_String_type publication_date_of_component,
      ILL_String_type author_of_article,
      ILL_String_type title_of_article,
      ILL_String_type pagination,
      EXTERNAL_type national_bibliography_no,
      ILL_String_type iSBN,
      ILL_String_type iSSN,
      EXTERNAL_type system_no,
      ILL_String_type additional_no_letters,
      ILL_String_type verification_reference_source)
    {
        this.item_type=item_type;
        this.held_medium_type=held_medium_type;
        this.call_number=call_number;
        this.author=author;
        this.title=title;
        this.sub_title=sub_title;
        this.sponsoring_body=sponsoring_body;
        this.place_of_publication=place_of_publication;
        this.publisher=publisher;
        this.series_title_number=series_title_number;
        this.volume_issue=volume_issue;
        this.edition=edition;
        this.publication_date=publication_date;
        this.publication_date_of_component=publication_date_of_component;
        this.author_of_article=author_of_article;
        this.title_of_article=title_of_article;
        this.pagination=pagination;
        this.national_bibliography_no=national_bibliography_no;
        this.iSBN=iSBN;
        this.iSSN=iSSN;
        this.system_no=system_no;
        this.additional_no_letters=additional_no_letters;
        this.verification_reference_source=verification_reference_source;
    }

    public String toString()
    {
        java.io.StringWriter sw = new java.io.StringWriter();
        sw.write("\n{\n");

        sw.write("item_type"=item_type);
        sw.write("held_medium_type"=held_medium_type);
        sw.write("call_number"=call_number);
        sw.write("author"=author);
        sw.write("title"=title);
        sw.write("sub_title"=sub_title);
        sw.write("sponsoring_body"=sponsoring_body);
        sw.write("place_of_publication"=place_of_publication);
        sw.write("publisher"=publisher);
        sw.write("series_title_number"=series_title_number);
        sw.write("volume_issue"=volume_issue);
        sw.write("edition"=edition);
        sw.write("publication_date"=publication_date);
        sw.write("publication_date_of_component"=publication_date_of_component);
        sw.write("author_of_article"=author_of_article);
        sw.write("title_of_article"=title_of_article);
        sw.write("pagination"=pagination);
        sw.write("national_bibliography_no"=national_bibliography_no);
        sw.write("iSBN"=iSBN);
        sw.write("iSSN"=iSSN);
        sw.write("system_no"=system_no);
        sw.write("additional_no_letters"=additional_no_letters);
        sw.write("verification_reference_source"=verification_reference_source);
        sw.write("\n}\n");
        return sw.toString();
    }

    public Item_Id_type() {}


}
