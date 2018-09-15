<%-- 
    Document   : index
    Created on : 2018-09-11, 13:30:48
    Author     : wq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1><a href="MaPage.html">Hello World!</a></h1>
        
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="formulaire.jsp">Ajouter BD</a></li>
            <li><a href="ajax.jsp">Ajax</a></li>
            <%
               Cookie[] cookies = null;
               cookies = request.getCookies();
               if(cookies != null) {
                   for(Cookie c : cookies) {
                       if(c.getName().equals("st_text")) {
                           out.print("<li><a>"+c.getValue()+"</a></li>");
                       }
                   }
               }
            %>
        </ul>
        
    </body>
</html>
