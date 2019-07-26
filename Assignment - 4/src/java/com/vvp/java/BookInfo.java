/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vvp.java;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;

/**
 *
 * @author PRIYANK DHRUV
 */
public class BookInfo extends TagSupport {
    private String imagex;
    private String title;
    private String author;
    private String publication;
    private String isbn;
    private float price;

    /**
    * Called by the container to invoke this tag. 
    * The implementation of this method is provided by the tag library developer,
    * and handles all tag processing, body iteration, etc.
    */
    public int doStartTag() throws JspException {
        try{
        JspWriter out= pageContext.getOut();
         out.print("<img src='"+imagex+"' width='100px' height='100px'/>");
            out.print("<h1>" + title + "</h1><br/>");
            out.print("<h2><i>" + author + "</i></h2><br/>");
            out.print("<h2><i>" + isbn + "</i></h2><br/>");
            out.print("<h2><i>" + publication + "</i></h2><br/>");
            out.print("<h2><i>" + price + "</i></h2><br/>");
        }catch(Exception e){
            e.printStackTrace();
        }
       return SKIP_BODY;
    }

    public void setImagex(String imagex) {
        this.imagex = imagex;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}