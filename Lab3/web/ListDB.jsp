<%-- 
    Document   : ListDB
    Created on : 2018-09-11, 14:40:16
    Author     : wq
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ca.wquintal.lib%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Hello World!</h3>
        
        <% List<ModelDB> items = (ArrayList<ModelBD>)request.getAttribute("items");
        
        
        %>
    </body>
</html>
