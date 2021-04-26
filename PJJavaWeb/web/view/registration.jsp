<%-- 
    Document   : registration
    Created on : Oct 22, 2020, 3:55:09 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssLogin.css" type="text/css">
        <title>Đăng ký</title>
    </head>
    <body style="margin: 0px">
        <div id="backgroungLogin">
            <div id="login">
                <div id="canchinhLogin">
                    <%
                        if(session.getAttribute("msg")==null){ 
                        }else{
                            %>
                            <h2>${sessionScope.msg}</h2>
                            <%
                            session.removeAttribute("msg");
                        }
                    %>
                    <h1 id="styleFont" style="color: #780062 ">ĐĂNG KÝ TÀI KHOẢN</h1>
                    <form action="../regis" method="post">
                        Tài khoản <input type="text" name="acc" required placeholder="Nhập tài khoản"/></br>
                        Mật khẩu <input type="password" name="pass" required placeholder="Nhập mật khẩu"/></br>
                        Email <input type="text" name="email" required placeholder="Nhập email"/></br>
                        <input type="hidden" name="cash" value="0"/>
                        <input type="hidden" name="type" value="0"/>
                        <input type="submit" value="OK"/>
                    </form>
                    <a href="../view/homepage.jsp"><h3 style="font-family: sans-serif;">Trang chủ</h3></a>
                </div>
            </div>
        </div>
    </body>
</html>
