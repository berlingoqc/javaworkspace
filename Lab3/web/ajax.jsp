<%-- 
    Document   : ajax
    Created on : 14-Sep-2018, 8:04:47 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script language='JavaScript'>
    function show() {
        
        document.getElementById("info_json").innerHTML="Started ...";
        var xmlhttp;
        var my_json_object = {};
        if(window.XMLHttpRequest) {
            xmlhttp = new XMLHttpRequest();
        } else {
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        
        xmlhttp.onreadystatechange=function() {
            if(xmlhttp.readyState === 4) {
                if(xmlhttp.status === 200) {
                    my_json_object = JSON.parse(xmlhttp.responseText);
                    document.getElementById("info_json").innerHTML = my_json_object["bonjour"];
                } else {
                    alert("HTTP error"+xmlhttp.status+":"+xmlhttp.statusText);
                }
            }
        }
        xmlhttp.open("GET","info_json.jsp");
        xmlhttp.send();
    }
    
    
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a href="#" onclick="show()">Cliquer ici pour faire une requete AJAX :0</a></hi>
        <p id="info_json">Hello World!</p>
    </body>
</html>
