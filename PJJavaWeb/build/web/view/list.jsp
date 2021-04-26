<%-- 
    Document   : list
    Created on : Oct 20, 2020, 7:26:06 PM
    Author     : asus
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/csslist.css" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="l_table">
            <h1 class="h1">Danh sách sản phẩm</h1>
            <table >
                <tr>
                    <th>STT</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price IN</th>
                    <th>Price OUT</th>
                    <th>Quantity</th>
                    <th>Type</th>
                    <th>Image</th>
                </tr>
                <%
                    if (session.getAttribute("data") != null) {
                        List<Product> list = (List<Product>) session.getAttribute("data");
                        int i = 1;
                        for (Product p : list) {
                %>
                <tr>
                    <td><%=i++%></td>
                    <td><%=p.getId()%></td>
                    <td><%=p.getName()%></td>
                    <td><%=p.getPriceIN()%></td>
                    <td><%=p.getPriceOUT()%></td>
                    <td><%=p.getQuantity()%></td>
                    <td><%=p.getType()%></td>
                    <td><img src="<%=p.getImage()%>" width="100px" height="100px"/></td>
                    <td><a href="../check?action=delete?id=<%=p.getId()%>">Delete</a></td>
                    <td><button><a href="../check?action=update?id=<%=p.getId()%>">Edit</a></button></td>
                </tr>
                <%
                        }
                        //session.removeAttribute("data");
                    }
                %>
            </table>  
        </div>

    </body>
</html>
