<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.webtask.entities.ListUsr" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <title>Index</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/list/add" >
    <input id="item" type="text" name="item">
    <input type="submit" value=<fmt:message key="back"/> >
</form>
<form method="post" action="${pageContext.request.contextPath}/list/remove-listener" >
    <input type="submit" value= <fmt:message key="listener.remove"/> >
</form>
<form method="post" action="${pageContext.request.contextPath}/list/add-listener" >
    <input type="submit" value=<fmt:message key="listener.add"/> >
</form>
<h3><fmt:message key="list.size"/> <% out.println(ListUsr.getSize()); %></h3>
<h4><fmt:message key="list.elemets"/> <% out.println(ListUsr.show()); %></h4>
<%@include file="footer.jsp"%>
</body>