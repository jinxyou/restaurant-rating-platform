<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>User Info</h3>
    <table border="1" width="600px">
        <tr>
            <td>username</td>
            <td>password</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.username}</td>
                <td>${a.password}</td>
                <td><a href="${pageContext.request.contextPath}/user/updatePassword?username=${a.username}">update</a>
                </td>
                <c:if test="${a.username != 'root'}">
                    <td><a href="${pageContext.request.contextPath}/user/removeByUsername?username=${a.username}">delete</a>
                    </td>

                </c:if>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>