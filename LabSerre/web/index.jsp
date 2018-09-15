<%-- 
    Document   : index
    Created on : 14-Sep-2018, 11:19:53 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ca.wquintal.lib.SettingsDB"%>
<%
    // Initialize mon SettingsDB s'il n'existe pas redirige vers une page pour
    // crée les settings
    SettingsDB set = new SettingsDB();
    if(!set.OpenConfig()) {
        // mets un cookie pour dire qu'il n'est pas configurer
    
        // redirige vers la page
        RequestDispatcher rd = request.getRequestDispatcher("/settingsdb.jsp");
        rd.forward(request,response);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Index</h1>
    </body>
</html>
