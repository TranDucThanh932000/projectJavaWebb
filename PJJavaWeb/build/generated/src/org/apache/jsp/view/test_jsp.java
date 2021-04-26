package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write(".mainmenubtn {\n");
      out.write("    background-color: red;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding:20px;\n");
      out.write("    margin-top:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".mainmenubtn:hover {\n");
      out.write("    background-color: red;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write(".dropdown {\n");
      out.write("    position: relative;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write(".dropdown-child {\n");
      out.write("    display: none;\n");
      out.write("    background-color: black;\n");
      out.write("    min-width: 200px;\n");
      out.write("}\n");
      out.write(".dropdown-child a {\n");
      out.write("    color: white;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".dropdown:hover .dropdown-child {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("<div class=\"dropdown\">\n");
      out.write("  <button class=\"mainmenubtn\">Main menu</button>\n");
      out.write("  <div class=\"dropdown-child\">\n");
      out.write("    <a href=\"http://wwww.yourdonain.com/page1.html\">Child menu 1</a>\n");
      out.write("    <a href=\"http://wwww.yourdonain.com/page2.html\">Child menu 2</a>\n");
      out.write("    <a href=\"http://wwww.yourdonain.com/page3.html\">Child menu 3</a>\n");
      out.write("    <a href=\"http://wwww.yourdonain.com/page4.html\">Child menu 4</a>\n");
      out.write("    <a href=\"http://wwww.yourdonain.com/page5.html\">Child menu 5</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
