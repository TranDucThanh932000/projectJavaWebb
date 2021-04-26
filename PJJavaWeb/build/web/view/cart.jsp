<%-- 
    Document   : cart
    Created on : Oct 27, 2020, 4:00:29 PM
    Author     : asus
--%>

<%@page import="dal.AccountDAO"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="model.Account"%>
<%@page import="model.Item"%>
<%@page import="java.util.List"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssCart.css" type="text/css">
        <title>Cart Page</title>
    </head>
    <body>
        
        <h1>Shopping cart online</h1>
        <table border="1px">
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>LessProduct</th>
                <th>MoreProduct</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Money</th>
                <th>Action</th>
            </tr>
            <%
                if (session.getAttribute("cart") != null) {
                    Cart cart = (Cart) session.getAttribute("cart");
                    List<Item> list = cart.getCart();
                    int i = 1;
                    for (Item t : list) {
            %>
            <tr>
            
                <td><%=i++%></td>
                <td><%=t.getProduct().getName()%></td>
                <td>
                    <form action="../../project/moreitem" method="post">
                        <input type="hidden" name="idprod" value="<%=t.getProduct().getId()%>"/>
                        <input type="submit" value="Less Item"/>
                        <input type="hidden" name="action" value="lessitem"/>
                    </form>
                </td>
                <td>
                    <form action="../../project/moreitem" method="post">
                        <input type="hidden" name="idprod" value="<%=t.getProduct().getId()%>"/>
                        <input type="submit" value="More Item"/>
                        <input type="hidden" name="action" value="moreitem"/>
                    </form>
                </td>
                <td><%=t.getQuantity()%></td>
                <td><%=t.getProduct().getPriceOUT()%></td>
                <td><%=t.getProduct().getPriceOUT()*t.getQuantity()%></td>
                <td>
                    <form action="../../project/process" method="post">
                        <input type="hidden" name="idprod" value="<%=t.getProduct().getId()%>"/>
                        <input type="submit" value="Return Item"/>
                        <input type="hidden" name="action" value="removeitem"/>
                    </form>
                </td>
                <%
                    }
                %>

            <h1>Total Money</h1>
            <h1><%=cart.getTotalMoney()%></h1>
            <%
                }
            %>
            <form action="../../project/process" method="post">
                <input type="hidden" name="action" value="checkout"/>
                <input type="submit" value="Check out"/>
            </form>
            <div>
            <%
                if(session.getAttribute("account")!=null){
                    AccountDAO dao = new AccountDAO();
                    //cap nhat lai so tien co hien tai (vi` khong thich' dung Servlet o jsp nay`) 
                    Account tk=dao.getAccount(((Account)session.getAttribute("account")).getUsername());                
                    %>
                    <h1>The amount in the account : <%=tk.getCash()%></h1>       
                    <%
                }
            %>
            </div>

    </body>
</html>
