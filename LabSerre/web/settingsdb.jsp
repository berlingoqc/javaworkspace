<%-- 
    Document   : settingsdb
    Created on : 14-Sep-2018, 11:24:47 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ca.wquintal.lib.MyBD"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="import.jsp" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DB settings</title>
        <script>
            function validateForm() {
                
            }
        </script>
    </head>
    <body>
        <br></br>
        <div class="container">
            <div class="jumbotron">
                <h1>Initialiser la base de donnée</h1>
                    <p>Entrer les informations de connexion pour la bd du site</p>
            </div>
        </div>
        
        <div class="container">
            <div class="col-md-4">
                <form class="needs-validation" onsubmit='validateForm()' action='configuredb.jsp'>
                    <div class="form-group">
                        <label for="driver">MySQL Driver:</label>
                        <select class="form-control" id="driver">
                            <% for(String driver: MyBD.Drivers) { %>
                                <option><%=driver%></option>
                            <%}%>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="host">Host:</label>
                        <input type="text" placeholder="127.0.0.1" class="form-control" id="host">

                    </div>
                    <div class="form-group">
                        <label for="database">Database:</label>
                        <input type="text" placeholder="testdb" class="form-control" id="database">
                    </div>
                    <div class="form-group">
                        <label for="user">User:</label>
                        <input type="text" placeholder="test" class="form-control" id="user">
                    </div>
                    <div class="form-group">
                        <label for="password">Password:</label>
                        <input type="password" class="form-control" id="password">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>
        </div>
    </body>
</html>
