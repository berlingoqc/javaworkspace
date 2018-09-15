<%-- 
    Document   : info_json
    Created on : 14-Sep-2018, 9:15:19 PM
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="org.json.JSONObject"%>
<%
    JSONObject obj = new JSONObject();
    obj.put("bonjour", "salut");
    response.getWriter().print(obj);
%>