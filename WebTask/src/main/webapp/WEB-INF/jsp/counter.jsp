<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.webtask.entities.Counter"%>
<%@ page import="com.example.webtask.entities.ListUsr" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <title>Index</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/counter/add" >
    <fmt:message key="count.add"/>
    <input type="submit" value=<fmt:message key="back"/> >
</form>
<h3><fmt:message key="count"/> <% out.println(Counter.getClassCount());%> </h3>
<%@include file="footer.jsp"%>
</body>