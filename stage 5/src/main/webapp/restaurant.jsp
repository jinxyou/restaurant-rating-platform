<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    Login Success, Welcome.<br>
    <a href="http://localhost:8080/city/getCityAvg">City Average Price In FL</a>
    <a href="http://localhost:8080/city/getInRange">Number of restaurant with price in range</a>
    <form action="${pageContext.request.contextPath}/restaurant/queryByState"><br>
        State:<input type="text" name="state"><br>
        <br>
        <input type="submit" value="Search By State">
    </form>

</center>
</body>
</html>