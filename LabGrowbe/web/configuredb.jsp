<%-- 
    Document   : configuredb
    Created on : 2018-09-17, 18:34:52
    Author     : wq
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="ca.wquintal.lib.ConnectionInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.json.JSONObject"%>
<%@page import="ca.wquintal.lib.SerreDB"%>
<%@page import="ca.wquintal.lib.SettingsDB"%>
<%
    ConnectionInfo ci = null;
    String connectionString = null;
    SerreDB db= null;
    
    String errorMessage = null;
%>
<%
    String driver = request.getParameter("driver");
    String host   = request.getParameter("host");
    String database = request.getParameter("database");
    String user = request.getParameter("user");
    String password = request.getParameter("password");
    
    ci = new ConnectionInfo(host, database, user, password, driver);
    connectionString = ci.GetConnection();
    
    try {
        // Crée mon instance de ma bd et essaye de crée mes tables
        db = new SerreDB(ci);
        if(!db.CreateTableFromFile("SQL/serre_tables.sql")) {
            // Faile to create sql table
            errorMessage = db.GetLastException().getLocalizedMessage();
            
        }
            errorMessage = "Table crée avec succès dans la bd";
            SettingsDB settings = new SettingsDB();
            if(!settings.SaveConfig(ci)) {
                errorMessage = settings.getLastException().getLocalizedMessage();
            }
       
    } catch(SQLException e) {
        errorMessage = e.getLocalizedMessage();
        
    } catch(ClassNotFoundException e) {
        errorMessage = e.getLocalizedMessage();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="import.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DB Configuration</title>
    </head>
    <body>
        <div class="container">
            <div>
                <h1>Configuration de la base de donnée</h1>
            </div>   
            <div class="row">
                <div class="col-md-2">Chaîne de connection :</div>
                <div class="col-md-2"> <p><%=connectionString%></p></div>
            </div>
            <div class="">
                <h3>Résultat création de la base de donnée</h3>
                <p><%=errorMessage%></p>
                <button type="button" class="btn">
                    <a href="index.jsp">Retourner a l'acceuil</a>
                </button>
            </div
        </div>
    </body>
</html>