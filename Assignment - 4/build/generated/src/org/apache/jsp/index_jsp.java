package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tlds/Book.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_nm_005fBook_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_nm_005fBook_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  nm:Book
    com.vvp.java.BookInfo _jspx_th_nm_005fBook_005f0 = (com.vvp.java.BookInfo) _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor.get(com.vvp.java.BookInfo.class);
    _jspx_th_nm_005fBook_005f0.setPageContext(_jspx_page_context);
    _jspx_th_nm_005fBook_005f0.setParent(null);
    // /index.jsp(18,8) name = imagex type = java.lang.String reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setImagex("Images/Reema_Thareja.jpg");
    // /index.jsp(18,8) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setTitle("Data-Structure Using C");
    // /index.jsp(18,8) name = author type = java.lang.String reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setAuthor("Reema Thareja");
    // /index.jsp(18,8) name = isbn type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setIsbn("0979995688248");
    // /index.jsp(18,8) name = publication type = java.lang.String reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setPublication("Oxford");
    // /index.jsp(18,8) name = price type = float reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_nm_005fBook_005f0.setPrice(1200.0f);
    int _jspx_eval_nm_005fBook_005f0 = _jspx_th_nm_005fBook_005f0.doStartTag();
    if (_jspx_eval_nm_005fBook_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("       ");
        int evalDoAfterBody = _jspx_th_nm_005fBook_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_nm_005fBook_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor.reuse(_jspx_th_nm_005fBook_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fnm_005fBook_0026_005ftitle_005fpublication_005fprice_005fisbn_005fimagex_005fauthor.reuse(_jspx_th_nm_005fBook_005f0);
    return false;
  }
}
