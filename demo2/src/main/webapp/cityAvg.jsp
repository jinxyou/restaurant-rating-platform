<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="1" width="600px">
        <tr>
            <td>City</td>
            <td>Avg Price</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.name}</td>
                <td>${a.avgPrice}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>