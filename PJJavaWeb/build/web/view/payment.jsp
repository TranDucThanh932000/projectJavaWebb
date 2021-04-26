<%-- 
    Document   : payment
    Created on : Oct 27, 2020, 4:22:42 PM
    Author     : asus
--%>

<%@page import="model.DetailOrder"%>
<%@page import="model.Order"%>
<%@page import="dal.ProductDAO"%>
<%@page import="dal.OrderDAO"%>
<%@page import="dal.AccountDAO"%>
<%@page import="model.Account"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssPayment.css" type="text/css">

        <title>JSP Page</title>
    </head>
    <body>

        <%
            if(session.getAttribute("lmn")!=null){
        %>
                <h1>${sessionScope.lmn}</h1>
                <a href="cart.jsp">Trở lại giỏ hàng</a>
            <% 
                session.removeAttribute("lmn");
                }
            if(session.getAttribute("messPayment")!=null){
        %>
        <h1>${sessionScope.messPayment}</h1>      
        <%
            session.removeAttribute("messPayment");
        }
        %>
        <%            
            if (session.getAttribute("notiPayment") != null) {
        %>
        <a href="cart.jsp">Trở lại giỏ hàng</a>
        <%  
            session.removeAttribute("notiPayment");
            }else{
            %>  
            <%
                }
    
        %>
        <a href="homepage.jsp">TRANG CHỦ</a>

    </body>
</html>
