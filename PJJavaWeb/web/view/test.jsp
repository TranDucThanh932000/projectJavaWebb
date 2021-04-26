<%-- 
    Document   : test
    Created on : Oct 26, 2020, 3:27:50 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
.mainmenubtn {
    background-color: red;
    color: white;
    border: none;
    cursor: pointer;
    padding:20px;
    margin-top:20px;
}

.mainmenubtn:hover {
    background-color: red;
    }
    
.dropdown {
    position: relative;
    display: inline-block;
}
.dropdown-child {
    display: none;
    background-color: black;
    min-width: 200px;
}
.dropdown-child a {
    color: white;
    padding: 20px;
    text-decoration: none;
    display: block;
}
.dropdown:hover .dropdown-child {
    display: block;
}
    </style>
    <body>
<div class="dropdown">
  <button class="mainmenubtn">Main menu</button>
  <div class="dropdown-child">
    <a href="http://wwww.yourdonain.com/page1.html">Child menu 1</a>
    <a href="http://wwww.yourdonain.com/page2.html">Child menu 2</a>
    <a href="http://wwww.yourdonain.com/page3.html">Child menu 3</a>
    <a href="http://wwww.yourdonain.com/page4.html">Child menu 4</a>
    <a href="http://wwww.yourdonain.com/page5.html">Child menu 5</a>
  </div>
</div>
</body>
</html>
