<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <title>Index</title>
</head>
<body class="text-center">
<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
<main role="main" class="inner cover mt-5">
    <label>
        <h1 class="cover-heading"><fmt:message key="welcome.message"/></h1>
    </label>
</main>
</div>
<button class="btn btn-sm btn-light" type="button" onclick="location.href='/list'"><fmt:message key="listusr"/></button>
<button class="btn btn-sm btn-light" type="button" onclick="location.href='/counter'"><fmt:message key="counter"/></button>
<%@include file="footer.jsp"%>
</body>
</html>