package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;
import model.Product;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Danh s??ch s???n ph???m</h1>\n");
      out.write("        <table border=\"2px\">\n");
      out.write("            <tr>\n");
      out.write("                <th>STT</th>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Price IN</th>\n");
      out.write("                <th>Price OUT</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <th>Image</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                if (request.getAttribute("data") != null) {
                    List<Product> list = (List<Product>) request.getAttribute("data");
                    int i = 1;
                    for (Product p : list) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i++);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getPriceIN());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getPriceOUT());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getQuantity());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getType());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(p.getImage());
      out.write("</td>\n");
      out.write("                <td><a href=\"check?action=delete?id=");
      out.print(p.getId());
      out.write("\">Delete</a></td>\n");
      out.write("                <td><button><a href=\"check?action=update?id=");
      out.print(p.getId());
      out.write("\">Edit</a></button></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                }
            
      out.write("\n");
      out.write("        </table>\n");
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
