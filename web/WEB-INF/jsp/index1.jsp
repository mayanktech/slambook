<%-- 
    Document   : index1
    Created on : Dec 6, 2014, 12:18:44 AM
    Author     : mayank
--%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- <c:set var="url">${pageContext.request.requestURL}</c:set> -->
        <base href="${fn:substring(url, 0, fn:length(url) - fn:length(pageContext.request.requestURI))}${pageContext.request.contextPath}/" />

        <link href="resources/css/bootstrap.min.css"  rel="stylesheet" type="text/css"/>
        <link href="resources/css/zocial.css"  rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="resources/js/jquery-1.8.0.min.js"></script>
        <script type="text/javascript" src="resources/js/bootstrap.js"></script>
        
        <link href="resources/css/datepicker3.css" rel="stylesheet">
         <script src="resources/js/bootstrap-datepicker.js"></script>
        <title>Slambook Bootstrap 1</title>

    </head>
    <body>
        <h1>Hello World! fdfff</h1>
    </body>
</html>
