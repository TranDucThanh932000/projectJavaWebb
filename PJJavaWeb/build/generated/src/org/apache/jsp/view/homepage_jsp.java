package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Product;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"../css/cssHomep.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <title>Home Page</title>\n");
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
      out.write("                        <a href=\"../../project/checkout\"><img src=\"../image/cartt.jpg\">\n");
      out.write("                        ");

                        if(session.getAttribute("amount")!=null){
                            
      out.write("\n");
      out.write("                            <span>");
      out.print((Integer.parseInt(session.getAttribute("amount")+"")));
      out.write("</span>\n");
      out.write("                            ");

                        }
                        
      out.write("\n");
      out.write("                        </a>\n");
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
      out.write("                    <li><a href=\"../../project/home\">TRANG CH???</a></li>\n");
      out.write("                    <li><a href=\"\">GI???I THI???U</a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <a href=\"\" class=\"mainmenubtn\">S???N PH???M</a>\n");
      out.write("                            <div class=\"dropdown-child\">\n");
      out.write("                                <a href=\"../showproduct?id=2\">M??</a>\n");
      out.write("                                <a href=\"../showproduct?id=0\">??o</a>\n");
      out.write("                                <a href=\"../showproduct?id=1\">Qu???n</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"\">TIN T???C - S??? KI???N</a></li>\n");
      out.write("                    <li><a href=\"\">LI??N H???</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"home_img1\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide border\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"../image/sale.png\" alt=\"Leopard\" height=\"520px\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"../image/carou2.jpg\" alt=\"Cat\" height=\"520px\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <img class=\"d-block w-100\" src=\"../image/carou3.jpg\" alt=\"Lion\" height=\"520px\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Controls -->\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bigcity_img\">\n");
      out.write("            <img src=\"../image/bigcity.png\" style=\"height: 200px;\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"home_img2\">\n");
      out.write("            <div class=\"pr\">\n");
      out.write("                <div class=\"pr_pr\">\n");
      out.write("                    <img src=\"../image/giaohang.jpg\">\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"font-weight: bold\" id=\"wtf\">GIAO H??NG TR??N TO??N QU???C</p>\n");
      out.write("                        <p id=\"wtf2\">Mi???n ph?? giao h??ng v???i c??c ????n h??ng tr??n 500k</p>       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pr_pr\">\n");
      out.write("                    <img src=\"../image/giaodich.jpg\">\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"font-weight: bold\" id=\"wtf\">?????I TR??? H??NG TRONG 3 NG??Y</p>\n");
      out.write("                        <p id=\"wtf2\">?????i v???i c??c s???n ph???m l???i ,h???ng do nh?? s???n xu???t</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"pr_pr\">\n");
      out.write("                    <img src=\"../image/gift.png\">\n");
      out.write("                    <div>\n");
      out.write("                        <p style=\"font-weight: bold\" id=\"wtf\">GI???M GI?? ?????C BI???T</p>\n");
      out.write("                        <p id=\"wtf2\">Tri ??n kh??ch h??ng v??o c??c d???p ?????c bi???t , l??? T???t</p>  \n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"product\">\n");
      out.write("\n");
      out.write("            <hr class=\"hr1\">\n");
      out.write("            <span style=\"font-weight: bolder\">S???N PH???M </span>\n");
      out.write("            <span style=\"color: fuchsia\"> B??N CH???Y</span>\n");
      out.write("            <hr class=\"hr2\">\n");
      out.write("            <div id=\"spBanChay\">\n");
      out.write("                ");
                    
                    List<String> top3banchay = (List<String>) session.getAttribute("top3banchay");
                    List<Product> list = (List<Product>) session.getAttribute("list");
                    for (int i = 0; i < top3banchay.size(); i++) {
                        for (Product t2 : list) {
                            if (top3banchay.get(i).equals(t2.getId())) {
                
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"\"><img src=\"");
      out.print(t2.getImage());
      out.write("\"></a>\n");
      out.write("                    <div id=\"addtoCart\">\n");
      out.write("                        <form name=\"f\" action=\"../processhp\" method=\"post\">\n");
      out.write("                            <button><img src=\"../image/cartt.jpg\" height=\"20px\" width=\"20px\"/></button>\n");
      out.write("                            <input type=\"hidden\" name=\"idprod\" value=\"");
      out.print(top3banchay.get(i));
      out.write("\"/>\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"additem\"/>\n");
      out.write("                        </form>  \n");
      out.write("                    </div>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <div id=\"inforBanChay\">\n");
      out.write("                        <span>");
      out.print(t2.getName());
      out.write("</span></br>\n");
      out.write("                        <span>");
      out.print(t2.getPriceOUT());
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                            }
                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("\n");
      out.write("            <hr class=\"hr1\">\n");
      out.write("            <span style=\"font-weight: bolder\">S???N PH???M </span>\n");
      out.write("            <span style=\"color: deepskyblue\"> X???N X??</span>\n");
      out.write("            <hr class=\"hr2\">\n");
      out.write("            <div id=\"spBanChay\">\n");
      out.write("                ");

                    List<String> top3xinxo = (List<String>) session.getAttribute("top3xinxo");
                    for (int i = 0; i < top3xinxo.size(); i++) {
                        for (Product t2 : list) {
                            if (top3xinxo.get(i).equals(t2.getId())) {
                
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"\"><img src=\"");
      out.print(t2.getImage());
      out.write("\"></a>\n");
      out.write("                    <div id=\"addtoCart\"><a href=\"#\"><img src=\"../image/cartt.jpg\" height=\"60px\" width=\"60px\"></a></div>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    </br>\n");
      out.write("                    <div id=\"inforBanChay\">\n");
      out.write("                        <span>");
      out.print(t2.getName());
      out.write("</span></br>\n");
      out.write("                        <span>");
      out.print(t2.getPriceOUT());
      out.write("</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");

                            }
                        }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"product\">\n");
      out.write("\n");
      out.write("            <hr class=\"hr1\">\n");
      out.write("            <span style=\"font-weight: bolder\">S???N PH???M </span>\n");
      out.write("            <span style=\"color: mediumvioletred\"> KHUY???N M???I</span>\n");
      out.write("            <hr class=\"hr2\">\n");
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
      out.write("                <span class=\"f_span\">????NG K?? NH???N TIN</span>\n");
      out.write("                <form action=\"#\" method=\"get\">\n");
      out.write("                    <input type=\"text\" required placeholder= \"Email c???a b???n\" size=\"95\"/>\n");
      out.write("                    <input type=\"submit\" value=\"SEND\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"f_bottom\">\n");
      out.write("                <div class=\"f_detail\">\n");
      out.write("                    <p class=\"f_detail_p1\">BIGCITYBOI</p>\n");
      out.write("                    <p>BIGCITYBOI cung c???p cho c??c ?????i t??c v?? ng?????i ti??u d??ng nh???ng s???n ph???m th???i trang ????ng tin c???y c??ng nh???ng d???ch v??? chuy??n nghi???p , t???o n??n s??? tin c???y khi ?????ng h??nh c??ng th????ng hi???u th???i trang.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"f_detail2\">\n");
      out.write("                    <p style=\"font-family: sans-serif;padding-top: 10px;\" >????N V??? V???N CHUY???N</p>\n");
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
      out.write("                    <h2>?????i h???c FPT H?? N???i</h2>\n");
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
