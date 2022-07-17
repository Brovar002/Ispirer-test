<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <title>Index</title>
</head>

<h1>
<fmt:message key="welcome.message"/> </h1>
<button type="button" onclick="location.href='/list'"><fmt:message key="listusr"/></button>
<button type="button" onclick="location.href='/counter'"><fmt:message key="counter"/></button>
<%@include file="footer.jsp"%>
</html>