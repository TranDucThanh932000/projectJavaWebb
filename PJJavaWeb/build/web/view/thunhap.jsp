<%-- 
    Document   : earn
    Created on : Nov 11, 2020, 9:10:15 PM
    Author     : asus
--%>

<%@page import="dal.DetailOrderDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.DetailOrder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../css/cssEarnn.css" type="text/css">
        <title>Thu nhập</title>
        
    </head>
    <script type="text/javascript">
    </script>
    <body>
        <div>
            <div>
                <form id="f" action="../../project/tienlai" method="post">
                    <%
                    int ycr=java.time.LocalDate.now().getYear();
                    %>
                    <select name="chooseyear" onchange="document.getElementById('f').submit()">
                        
                        <option value="<%=ycr%>" ${sessionScope.cho}><%=ycr%></option>
                        <option value="<%=ycr-1%>" ${sessionScope.cho1}><%=ycr-1%></option>
                        <option value="<%=ycr-2%>" ${sessionScope.cho2}><%=ycr-2%></option>
                        <option value="<%=ycr-3%>" ${sessionScope.cho3}><%=ycr-3%></option>
                        <option value="<%=ycr-4%>" ${sessionScope.cho4}><%=ycr-4%></option>
                        <option value="<%=ycr-5%>" ${sessionScope.cho5}><%=ycr-5%></option>
                        <option value="<%=ycr-6%>" ${sessionScope.cho6}><%=ycr-6%></option>
                        <option value="<%=ycr-7%>" ${sessionScope.cho7}><%=ycr-7%></option>
                        <option value="<%=ycr-8%>" ${sessionScope.cho8}><%=ycr-8%></option>
                        <option value="<%=ycr-9%>" ${sessionScope.cho9}><%=ycr-9%></option>
                        <option value="<%=ycr-10%>" ${sessionScope.cho10}><%=ycr-10%></option>

                    </select>
                </form>
            </div>
            <div class="parentzzz">
                <%
                    session.removeAttribute("cho");
                    session.removeAttribute("cho1");
                    session.removeAttribute("cho2");
                    session.removeAttribute("cho3");
                    session.removeAttribute("cho4");
                    session.removeAttribute("cho5");
                    session.removeAttribute("cho6");
                    session.removeAttribute("cho7");
                    session.removeAttribute("cho8");
                    session.removeAttribute("cho9");
                    session.removeAttribute("cho10");
                    List<DetailOrder> list=(List<DetailOrder>) session.getAttribute("listDO");
                    
                    if(session.getAttribute("curMonth")!=null){
                    int curMonth = Integer.parseInt(session.getAttribute("curMonth")+"");


                %>
                <ul>
                    <%
                        for (int i = 1; i <= curMonth; i++) {
                            if (i % 3 != 1) {
                    %>
                    <div class="childzzz">
                        <li><%=i%></li>
                        
                        <%
                            double a=0;
                            DetailOrderDAO ddao= new DetailOrderDAO();
                            String themso0="";
                            if(i<10){
                                themso0="0"+i;
                            a=ddao.tinhtienLaiTheoThangNam(list, themso0,java.time.LocalDate.now().getYear()+"");
                            }else{
                            a=ddao.tinhtienLaiTheoThangNam(list, i+"",java.time.LocalDate.now().getYear()+"");
                            }
                        %>    
                       <h2><%=a%></h2>
                    </div>
                    <%
                    } else {
                    %>
                </ul>
                <ul>
                    <div class="childzzz">
                        <li><%=i%></li>
                        <%
                            double a=0;
                            DetailOrderDAO ddao= new DetailOrderDAO();
                            String themso0="";
                            if(i<10){
                                themso0="0"+i;
                            a=ddao.tinhtienLaiTheoThangNam(list, themso0,java.time.LocalDate.now().getYear()+"");
                            }else{
                            a=ddao.tinhtienLaiTheoThangNam(list, i+"",java.time.LocalDate.now().getYear()+"");
                            }
                        %>    
                       <h2><%=a%></h2>
                    </div>
                    <%
                            }
                        }
                        session.removeAttribute("curMonth");
                    }else{
                    %>
                <ul>
                    <%
                        for (int i = 1; i <= 12; i++) {
                            if (i % 3 != 1) {
                    %>
                    <div class="childzzz">
                        <li><%=i%></li>
                        <%
                            String choosey=session.getAttribute("chooseyear")+"";
                            double a=0;
                            DetailOrderDAO ddao= new DetailOrderDAO();
                            String themso0="";
                            if(i<10){
                                themso0="0"+i;
                            a=ddao.tinhtienLaiTheoThangNam(list, themso0,choosey);
                            }else{
                            a=ddao.tinhtienLaiTheoThangNam(list, i+"",choosey);
                            }
                        %>    
                       <h2><%=a%></h2>
                    </div>
                    <%
                    } else {
                    %>
                </ul>
                <ul>
                    <div class="childzzz">
                        <li><%=i%></li>
                        <%
                            String choosey=session.getAttribute("chooseyear")+"";
                            double a=0;
                            DetailOrderDAO ddao= new DetailOrderDAO();
                            String themso0="";
                            if(i<10){
                                themso0="0"+i;
                            a=ddao.tinhtienLaiTheoThangNam(list, themso0,choosey);
                            }else{
                            a=ddao.tinhtienLaiTheoThangNam(list, i+"",choosey);
                            }
                        %>    
                       <h2><%=a%></h2>
                    </div>
                    <%
                            }
                        }                    
                    }
                    %>
            </div>
        </div>
    </body>
</html>
