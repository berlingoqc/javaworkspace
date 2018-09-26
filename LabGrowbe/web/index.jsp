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
        <jsp:include page="import.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script language='JavaScript'>
        $(document).ready(function() {
            var request = $.ajax({
                type:   "GET",
                url:    "api/datareport",
                data:   "id=1"
            });
            request.fail(function(jqXHR,textStatus, errorThrown) {
                alert("FAIL to request"+jqXHR+" "+textStatus+" "+errorThrown);
            })
            request.done(function(msg) {
                alert(msg);
            })
        })
    </script>
    <body>
        <h1>Hello World! Index</h1>
        <h3><%=System.getProperty("user.dir")%></h3>
        <p id="info_json"></p>
        <script type="text/javascript" language="JavaScript">
            show();
        </script>
    </body>
</html>
