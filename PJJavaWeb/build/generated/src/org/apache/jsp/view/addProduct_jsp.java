package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/cssAdd.css\" type=\"text/css\">\n");
      out.write("        <title>Add Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"con\">\n");
      out.write("            <div class=\"a_form\">  \n");
      out.write("                ");

                if(session.getAttribute("mess")!=null){
                    
      out.write("\n");
      out.write("                    <h2 id=\"h2\" style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                    ");

                    session.removeAttribute("mess");
                }
                
      out.write(" \n");
      out.write("                <h2 id=\"h2\">B???ng ??i???n th??ng tin s???n ph???m m???i</h2>\n");
      out.write("                <div class=\"edit\">\n");
      out.write("                    <div class=\"form_right\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Nh???p id</li>\n");
      out.write("                            <li>Nh???p name</li>\n");
      out.write("                            <li>Nh???p priceIN</li>\n");
      out.write("                            <li>Nh???p priceOUT</li>\n");
      out.write("                            <li>Nh???p quantity</li>\n");
      out.write("                            <li>Nh???p type</li>\n");
      out.write("                            <li>Nh???p image</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <form action=\"../add\" method=\"post\">\n");
      out.write("                        <input type=\"text\" name=\"id\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"text\" name=\"name\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"number\" name=\"pin\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"number\" name=\"pout\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"number\" name=\"quantity\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"number\" name=\"type\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"text\" name=\"image\" required placeholder=\"...\"/></br>\n");
      out.write("                        <input type=\"submit\" value=\"Th??m s???n ph???m\"/>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
