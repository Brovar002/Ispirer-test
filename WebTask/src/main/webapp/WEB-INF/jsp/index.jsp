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
<span> <fmt:message key="language.change"/></span>:
<label for="locales"></label>
<select id="locales">
    <option value=""></option>
    <option value="en">
    <fmt:message key="lang.eng"/></option>
    <option value="ru"> <fmt:message key="lang.ru"/></option>
</select>
<input  type="button" id="MyButton"  value="OK">  <fmt:message key="select"/>
</input>
</body>
<script type="text/javascript">
    $(document).ready(function () {
        $("#MyButton").click(function () {
            var selectedOption = $('#locales').val();
            if (selectedOption !== '') {
                window.location.replace('?lang=' + selectedOption);
            }
        });
    });
</script>
</html>