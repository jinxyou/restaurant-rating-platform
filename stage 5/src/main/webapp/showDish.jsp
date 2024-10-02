<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>Menu</h3>
    <%-- Use ${business_id} to get which restaurant this menu is belong to} --%>
    <table border="1" width="400px">
        <tr>
            <td>name</td>
            <td>Price</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.name}</td>
                <td>${a.price}</td>
                <td><a href="${pageContext.request.contextPath}/comment/queryByDish?name=${a.name}&Restaurant=${a.restaurant}">Comments</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" onclick="location.href='${pageContext.request.contextPath}/dish/addDish?id=${business_id}';" value="Add New Dish" />
    <input type="button" onclick="location.href='${pageContext.request.contextPath}/restaurant.jsp';" value="Home" />
</center>

</body>
</html>