<%-- 
    Document   : searchproduct
    Created on : Nov 4, 2020, 10:26:54 PM
    Author     : asus
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssShowProductt.css" type="text/css">
        <title>Search product Page</title>
    </head>
    <body>
        <%@include file="../view/Header.jsp" %>
        <div id="totalBody">
            <div id="showProduct">
                <%                    
                    if (session.getAttribute("dataa") != null) {
                        List<Product> list = (List<Product>) session.getAttribute("dataa");
                        int i = 0;
                        for (Product c : list) {
                %>
                <div id="eachProduct">
                    <a href="">
                    <img src="<%=c.getImage()%>" width="190px" height="190px">
                    <div class="themhang">
                        <form action="../../project/processsp" method="post">
                            <div class="iCart">
                            <button type="submit"><img src="../image/cartt.jpg" height="20px" width="20px"/></button>
                            </div>
                            <input type="hidden" name="idprod" value="<%=c.getId()%>"/>
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
                    <div id="in4product">
                        <p><%=c.getName()%></p>
                        <p><%=c.getPriceOUT()%></p>  
                    </div>
                    </a>
                </div>
                <%
                        }
                    }
                %>
            </div>
            <div id="amountPage">
                <ul id="phantrang">
                    <%
                        int a, b;
                        int size = Integer.parseInt(session.getAttribute("size")+"");
                        int numberPage = size / 4;
                        if (numberPage * 4 < size) {
                            numberPage += 1;
                        }
                        for (int i = 1; i <= numberPage; i++) {
                            a = (i - 1) * 4;
                            b = i * 4;
                            if (b > size) {
                                b = size;
                            }
                    %>
                    <li class="pagination"><button><a  href="../searchitem?start=<%=a%>&end=<%=b%>"><%=i%></a></button></li>
                        <%
                            }
                        %>
                </ul>
            </div>
        </div>
        <%@include file="../view/Footer.jsp" %>
    </body>
</html>
