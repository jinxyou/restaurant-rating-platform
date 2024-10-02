<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>Restaurant List</h3>
    <table border="1" width="600px">
        <tr>
            <td>name</td>
            <td>address</td>
            <td>city</td>
            <td>stars</td>
            <td>categories</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.name}</td>
                <td>${a.address}</td>
                <td>${a.city}</td>
                <td>${a.stars}</td>
                <td>${a.categories}</td>
                <td><a href="${pageContext.request.contextPath}/dish/queryByRestaurant?id=${a.business_id}">Menu</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>