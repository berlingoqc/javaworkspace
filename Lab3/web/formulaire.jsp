<%-- 
    Document   : Formulaire
    Created on : 14-Sep-2018, 7:34:44 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script>
            function validateForm() {
                var x = document.forms["superTableForm"]["st_text"].value;
                if (x === "") {
                    alert("Name must be filled out");
                    return false;
                }
            }
        </script>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <h2> Prépare toi a un formulaire de ouf </2>
        </div>
        <form id="superTableForm" onsubmit="return validateForm()" action="formulaire.jsp">
            <fieldset style="width:20em;">
                <legend>Formulaire de SuperTable</legend>
                <b>Text:</b>&nbsp;<input name="st_text" type="text"/><br/>
            </fieldset>
            <p><input type="submit"/><input type="reset"/>
        </form>
        <%
            String value;
            value = request.getParameter("st_text");
            if(value != null && !value.equals("")) {
                // ajout l'informations dans mon cookie
                Cookie cText = new Cookie("st_text",value);
                cText.setMaxAge(60*60*10);
                
                response.addCookie(cText);
                
                out.print("<b>"+value+ "</b>");
            }            
        %>
    </body>
</html>
