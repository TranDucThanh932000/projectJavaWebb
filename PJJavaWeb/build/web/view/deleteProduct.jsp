<%-- 
    Document   : deleteProduct
    Created on : Oct 20, 2020, 3:48:01 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssDelete.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d_form">
            <div class="d_form2">
                <%
                    if (session.getAttribute("mess") != null) {
                %>
                <h2 id="h2" style="color:red">${sessionScope.mess}</h2>
                <%
                        session.removeAttribute("mess");
                    }
                %> 
                <h2 id="h2">Bảng điền thông tin sản phẩm cần xóa</h2>
                <form action="../delete" method="post">
                    Nhập id <input type="text" name="id" required placeholder ="..."/>
                    <input type="submit" value="Xóa sản phẩm">
                </form>
            </div>
        </div>
    </body>
</html>
