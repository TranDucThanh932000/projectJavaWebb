<%-- 
    Document   : homepage
    Created on : Oct 14, 2020, 7:21:13 PM
    Author     : asus
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssHomepa.css" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">

        <title>Home Page</title>
    </head>
    <body>
        <%@include file="../view/Header.jsp" %>
        <div class="home_img1">
            <%--<img src="../image/sale.png">--%>
            <div id="myCarousel" class="carousel slide border" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100" src="../image/sale.png" alt="Leopard" height="520px">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="../image/carou2.jpg" alt="Cat" height="520px">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100" src="../image/carou3.jpg" alt="Lion" height="520px">
                    </div>
                </div>
                <!-- Controls -->
                <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        </div>
        <div class="bigcity_img">
            <img src="../image/bigcity.png" style="height: 200px;">
        </div>
        <div class="home_img2">
            <div class="pr">
                <div class="pr_pr">
                    <img src="../image/giaohang.jpg">
                    <div>
                        <p style="font-weight: bold" id="wtf">GIAO HÀNG TRÊN TOÀN QUỐC</p>
                        <p id="wtf2">Miễn phí giao hàng với các đơn hàng trên 500k</p>       
                    </div>
                </div>
                <div class="pr_pr">
                    <img src="../image/giaodich.jpg">
                    <div>
                        <p style="font-weight: bold" id="wtf">ĐỔI TRẢ HÀNG TRONG 3 NGÀY</p>
                        <p id="wtf2">Đối với các sản phẩm lỗi ,hỏng do nhà sản xuất</p>
                    </div>
                </div>
                <div class="pr_pr">
                    <img src="../image/gift.png">
                    <div>
                        <p style="font-weight: bold" id="wtf">GIẢM GIÁ ĐẶC BIỆT</p>
                        <p id="wtf2">Tri ân khách hàng vào các dịp đặc biệt , lễ Tết</p>  
                    </div>
                </div> 
            </div>
        </div>
        </br>
        </br>
        </br>
        <div class="product">

            <hr class="hr1">
            <span style="font-weight: bolder">SẢN PHẨM </span>
            <span style="color: fuchsia"> BÁN CHẠY</span>
            <hr class="hr2">
            <div id="spBanChay">
                <%                    
                    List<String> top3banchay = (List<String>) session.getAttribute("top3banchay");
                    List<Product> list = (List<Product>) session.getAttribute("list");
                    for (int i = 0; i < top3banchay.size(); i++) {
                        for (Product t2 : list) {
                            if (top3banchay.get(i).equals(t2.getId())) {
                %>
                <div class="sphover">
                    <a href=""><img src="<%=t2.getImage()%>"></a>
                    <div id="addtoCart">
                        <form name="f" action="../processhp" method="post">
                            <div class="iCart">
                            <button><img src="../image/cartt.jpg" height="20px" width="20px"/></button>
                            </div>
                            <input type="hidden" name="idprod" value="<%=top3banchay.get(i)%>"/>
                            <input type="hidden" name="action" value="additem"/>
                        </form>  
                    </div>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    <div id="inforBanChay">
                        <span><%=t2.getName()%></span></br>
                        <span><%=t2.getPriceOUT()%></span>
                    </div>
                </div>
                <%
                            }
                        }
                    }
                %>

            </div>
        </div>
        <div class="product">

            <hr class="hr1">
            <span style="font-weight: bolder">SẢN PHẨM </span>
            <span style="color: deepskyblue"> XỊN XÒ</span>
            <hr class="hr2">
            <div id="spBanChay">
                <%
                    List<String> top3xinxo = (List<String>) session.getAttribute("top3xinxo");
                    for (int i = 0; i < top3xinxo.size(); i++) {
                        for (Product t2 : list) {
                            if (top3xinxo.get(i).equals(t2.getId())) {
                %>
                <div class="sphover">
                    <a href=""><img src="<%=t2.getImage()%>"></a>
                    <div id="addtoCart">
                        <form name="f" action="../processhp" method="post">
                            <div class="iCart">
                            <button><img src="../image/cartt.jpg" height="20px" width="20px"/></button>
                            </div>
                            <input type="hidden" name="idprod" value="<%=top3xinxo.get(i)%>"/>
                            <input type="hidden" name="action" value="additem"/>
                        </form>
                    </div>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    </br>
                    <div id="inforBanChay">
                        <span><%=t2.getName()%></span></br>
                        <span><%=t2.getPriceOUT()%></span>
                    </div>
                    </br>
                    </br>
                </div>
                <%
                            }
                        }
                    }
                %>

            </div>
        </div>

        <%@include file="../view/Footer.jsp" %>
    </body>
</html>
