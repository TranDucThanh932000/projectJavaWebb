<%-- 
    Document   : Header
    Created on : Oct 14, 2020, 3:47:34 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssheaderrrr.css" type="text/css">
        <title>Header Page</title>
    </head>
    <body>
        <div class="header">
            <div class="ccontainer">
                <div class="left-header">
                    <div class="img">
                        <a href="https://www.facebook.com/TranDucThanh2k/"><img src="../image/fb.png"></a>
                        <a href="https://www.facebook.com/TranDucThanh2k/"><img src="../image/insta.jpg"></a>
                        <a href="https://www.facebook.com/TranDucThanh2k/"><img src="../image/linkedin.png"></a> 
                    </div>
                </div>
                <div class="main">
                    <div>BIGCITYBOI</div>
                </div>
                <div class="rright-header">
                    <div>
                        <a href="../../project/checkout"><img src="../image/cartt.jpg">
                        <%
                        if(session.getAttribute("amount")!=null){
                            %>
                            <span><%=(Integer.parseInt(session.getAttribute("amount")+""))%></span>
                            <%
                        }
                        %>
                        </a>
                            <%
                                if (session.getAttribute("account") != null) {
                            %>
                        <a href="../../project/logout">Log out</a>
                        <%
                        } else {
                        %>
                        <a href="../view/login.jsp"><img src="../image/images.png"></a>
                            <%
                                }
                            %>
                    </div>
                    </br>
                    </br>
                    <div class="icon-sch">
                        <form action="../../project/searchitem" method="post">
                            <div class="inputSch" style="margin-top: 0px">
                                <input type="text" name="txtSearch"/>
                            </div>
                            <button type="submit" class="btn-sch" style="background-color: white;border: none"><img src="../image/icon-search1.png"/></button>                                
                        </form>
                        
                    </div>
                </div>
            </div>
            <hr size="5">
            <div class="menu">
                <ul>
                    <li><a href="../../project/home">TRANG CH???</a></li>
                    <li><a href="">GI???I THI???U</a></li>
                    <li>
                        <div class="dropdown">
                            <a href="" class="mainmenubtn">S???N PH???M</a>
                            <div class="dropdown-child">
                                <a href="../showproduct?id=2">M??</a>
                                <a href="../showproduct?id=0">??o</a>
                                <a href="../showproduct?id=1">Qu???n</a>
                            </div>
                        </div>
                    </li>
                    <li><a href="">TIN T???C - S??? KI???N</a></li>
                    <li><a href="">LI??N H???</a></li>
                </ul>
            </div>
        </div>
    </body>
</html>
