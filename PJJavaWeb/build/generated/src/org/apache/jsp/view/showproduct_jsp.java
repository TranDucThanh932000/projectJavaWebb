package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;

public final class showproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/../view/Header.jsp");
    _jspx_dependants.add("/view/../view/Footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/cssShowProduct.css\" type=\"text/css\">\n");
      out.write("        <title>Show Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/cssheaderr.css\" type=\"text/css\">\n");
      out.write("        <title>Header Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"left-header\">\n");
      out.write("                    <div class=\"img\">\n");
      out.write("                        <a href=\"https://www.facebook.com/TranDucThanh2k/\"><img src=\"../image/fb.png\"></a>\n");
      out.write("                        <a href=\"https://www.facebook.com/TranDucThanh2k/\"><img src=\"../image/insta.jpg\"></a>\n");
      out.write("                        <a href=\"https://www.facebook.com/TranDucThanh2k/\"><img src=\"../image/linkedin.png\"></a> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <div>BIGCITYBOI</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-header\">\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"\"><img src=\"../image/cartt.jpg\"></a>\n");
      out.write("                            ");

                                if (session.getAttribute("account") != null) {
                            
      out.write("\n");
      out.write("                        <a href=\"../../project/logout\">Log out</a>\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("                        <a href=\"../view/login.jsp\"><img src=\"../image/images.png\"></a>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr size=\"5\">\n");
      out.write("            <div class=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"\">TRANG CHỦ</a></li>\n");
      out.write("                    <li><a href=\"\">GIỚI THIỆU</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <a href=\"\" class=\"mainmenubtn\">SẢN PHẨM</a>\n");
      out.write("                            <div class=\"dropdown-child\">\n");
      out.write("                                <a href=\"../showproduct?id=2\">Mũ</a>\n");
      out.write("                                <a href=\"../showproduct?id=0\">Áo</a>\n");
      out.write("                                <a href=\"../showproduct?id=1\">Quần</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">TIN TỨC - SỰ KIỆN</a></li>\n");
      out.write("                    <li><a href=\"\">LIÊN HỆ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div id=\"totalBody\">\n");
      out.write("            <div id=\"showProduct\">\n");
      out.write("                ");
                
                    if (session.getAttribute("dataa") != null) {
                        List<Product> list = (List<Product>) session.getAttribute("dataa");
                        int i = 1;
                        for (Product c : list) {
                
      out.write("\n");
      out.write("                            <div id=\"eachProduct\">\n");
      out.write("                                <img src=\"");
      out.print(c.getImage());
      out.write("\" width=\"100px\" height=\"100px\">\n");
      out.write("                                ");
      out.print(c.getId());
      out.write("\n");
      out.write("                                ");
      out.print(c.getName());
      out.write("<\n");
      out.write("                                ");
      out.print(c.getPriceOUT());
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"amountPage\">\n");
      out.write("                <ul>\n");
      out.write("                    ");
                    int a, b;
                        int id = Integer.parseInt(session.getAttribute("id") + "");
                        int size = Integer.parseInt(session.getAttribute("size") + "");
                        int numberPage = size / 4;
                        if (numberPage * 4 < size) {
                            numberPage += 1;
                        }
                        for (int i = 1; i <= numberPage; i++) {
                            a = (i - 1) * 4;
                            b = i * 4;
                            if (b > size) {
                                b = size;
                            }
                    
      out.write("\n");
      out.write("                    <!--                            url của Servlet list-->\n");
      out.write("                    <li class=\"pagination\"><a href=\"../showproduct?id=");
      out.print(id);
      out.write("&start=");
      out.print(a);
      out.write("&end=");
      out.print(b);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/footer.css\" type=\"text/css\">\n");
      out.write("        <title>Footer Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"f_header\">\n");
      out.write("                <span class=\"f_span\">ĐĂNG KÝ NHẬN TIN</span>\n");
      out.write("                <form action=\"#\" method=\"get\">\n");
      out.write("                    <input type=\"text\" required placeholder= \"Email của bạn\" size=\"95\"/>\n");
      out.write("                    <input type=\"submit\" value=\"SEND\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"f_bottom\">\n");
      out.write("                <div class=\"f_detail\">\n");
      out.write("                    <p class=\"f_detail_p1\">BIGCITYBOI</p>\n");
      out.write("                    <p>BIGCITYBOI cung cấp cho các đối tác và người tiêu dùng những sản phẩm thời trang đáng tin cậy cùng những dịch vụ chuyên nghiệp , tạo nên sự tin cậy khi đồng hành cùng thương hiệu thời trang.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"f_detail2\">\n");
      out.write("                    <p style=\"font-family: sans-serif\" >ĐƠN VỊ VẬN CHUYỂN</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><img src=\"../image/vietnampost.png\"></li>\n");
      out.write("                        <li><img src=\"../image/bestexpress.png\"></li>\n");
      out.write("                        <li><img src=\"../image/grapExpress.png\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f_infor\">\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <img src=\"../image/diachi.png\">\n");
      out.write("                    <h2>Đại học FPT Hà Nội</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <img src=\"../image/phone.png\">\n");
      out.write("                    <h2>0948621328 - 123456789</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"\">\n");
      out.write("                    <img src=\"../image/email.png\">\n");
      out.write("                    <h2>tranducthanh@gmail.com</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
