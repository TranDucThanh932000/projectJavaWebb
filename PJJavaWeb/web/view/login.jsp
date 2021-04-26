<%-- 
    Document   : login
    Created on : Oct 15, 2020, 10:22:39 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssLogin.css" type="text/css">
       
        <title>Login Page</title>
        
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
                    <h1 id="styleFont" style="color: #780062 ">ĐĂNG NHẬP TÀI KHOẢN</h1>
                    <form action="../login" method="post">
                        Tài khoản <input type="text" name="acc" required placeholder="Nhập tài khoản"/></br>
                        Mật khẩu <input type="password" name="pass" required placeholder="Nhập mật khẩu"/></br>
                        <input type="submit" value="Đăng Nhập"/>
                    </form>
                    <a href="../view/getPass.jsp"><h3 style="font-family: sans-serif;">QUÊN MẬT KHẨU</h3></a>
                    <a href="../view/registration.jsp"><h3 style="font-family: sans-serif;">ĐĂNG KÝ TÀI KHOẢN</h3></a>
                </div>
            </div>
        </div>
    </body>
</html>
