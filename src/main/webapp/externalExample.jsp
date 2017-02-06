<%-- 
    Document   : externalExample
    Created on : Feb 5, 2017, 10:01:50 PM
    Author     : Mike
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>External Page Load</title>
    </head>
    <body>
        <h1>Using c:out to load a page inside a page</h1>
        <a href="index.jsp">Back</a>
        <c:import url="http://www.google.com"></c:import>
    </body>
</html>
