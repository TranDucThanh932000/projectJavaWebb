<%-- 
    Document   : manager
    Created on : Oct 19, 2020, 8:29:58 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssManagerrr.css" type="text/css">
        <title>Manager Page</title>
    </head>
    <body>
        <div class="m_header">
            <ul>
                <li><a href="../list">Danh sách sản phẩm</a></li>
                <li><a href="../view/addProduct.jsp">Thêm sản phẩm</a></li>
                <li><a href="../view/updateProduct.jsp">Sửa thông tin sản phẩm</a></li> 
                <li><a href="../view/deleteProduct.jsp">Xóa sản phẩm</a></li>
                <li>
                    <a href="#">Thống kê</a>
                    <ul class="sub-menu_thongke">
                        <li><a href="../../project/tienlai">Thu nhập của từng tháng trong các năm</a></li>
                        <li><a href="../../project/spchuabanduoc">Sản phẩm chưa bán được</a></li>
                    </ul>
                </li>
                <li><a href="../../project/logout">Log out</a></li>
            </ul>
        </div>
    </body>
</html>
