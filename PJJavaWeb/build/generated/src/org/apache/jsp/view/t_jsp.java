package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class t_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <style>\n");
      out.write(".carousel-inner .item .carousel-caption {\n");
      out.write("position:absolute;\n");
      out.write("top: 200px\n");
      out.write("}\n");
      out.write(".carousel-indicators {\n");
      out.write("position: absolute;\n");
      out.write("top: 400px;\n");
      out.write("}\n");
      out.write(".navbar {\n");
      out.write("margin-bottom:0;\n");
      out.write("}\n");
      out.write(".navbar-nav>li>a {\n");
      out.write("line-height: 50px;\n");
      out.write("font-size: 16px\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#owl-demo\").owlCarousel({\n");
      out.write("                autoPlay: 3000, //Set AutoPlay to 3 seconds\n");
      out.write("                items: 4,\n");
      out.write("                itemsDesktop: [1199, 3],\n");
      out.write("                itemsDesktopSmall: [979, 3]\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<div id=\"carousel-example-generic\" class=\"carousel slide\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("\n");
      out.write("  <!-- Wrapper for slides -->\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("        <img src=\"../image/sale.png\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1>Large Desktops are everywhere</h1>\n");
      out.write("        <p><button class=\"btn btn-success btn-lg\">Try 30 day trial now</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("        <img src=\"../image/bigcity.png\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1>Mobiles are outnumbering desktops</h1>\n");
      out.write("        <p><button class=\"btn btn-success btn-lg\">Try 30 day trial now</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("<div class=\"item\">\n");
      out.write("    <img src=\"../image/bigcity.png\" alt=\"...\">\n");
      out.write("      <div class=\"carousel-caption\">\n");
      out.write("        <h1>Enterprises are adopting Cloud computing fast</h1>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("    <span class=\"icon-prev\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("    <span class=\"icon-next\"></span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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
