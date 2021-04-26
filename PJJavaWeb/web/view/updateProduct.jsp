<%-- 
    Document   : addProduct
    Created on : Oct 20, 2020, 12:10:24 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssAdd.css" type="text/css">
        <title>Add Page</title>
    </head>
    <body>
        <div class="con">
            <div class="a_form">  
                <%
                if(session.getAttribute("messs")!=null){
                    %>
                    <h2 id="h2" style="color:red">${sessionScope.messs}</h2>
                    <%
                    session.removeAttribute("messs");
                }
                %> 
                <h2 id="h2">Bảng sửa thông tin sản phẩm</h2>
                <div class="edit">
                    <div class="form_right">
                        <ul>
                            <li>Nhập id</li>
                            <li>Nhập name</li>
                            <li>Nhập priceIN</li>
                            <li>Nhập priceOUT</li>
                            <li>Nhập quantity</li>
                            <li>Nhập type</li>
                            <li>Nhập image</li>
                        </ul>
                    </div>
                        <%
                        String s="";
                        if(session.getAttribute("getid")!=null){
                            s=session.getAttribute("getid").toString();
                            session.removeAttribute("getid");
                        }else{
                            s="";
                        }
                        %>
                    <form action="../update" method="post">
                        <input type="text" name="id" value="<%=s%>"  required placeholder="..."/></br>
                        <input type="text" name="name" required placeholder="..."/></br>
                        <input type="number" name="pin" required placeholder="..."/></br>
                        <input type="number" name="pout" required placeholder="..."/></br>
                        <input type="number" name="quantity" required placeholder="..."/></br>
                        <input type="number" name="type" required placeholder="..."/></br>
                        <input type="text" name="image" required placeholder="..."/></br>
                        <input type="submit" value="Sửa sản phẩm"/>
                    </form>
                </div>

            </div>
        </div>
    </body>
</html>
