<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>Menu</h3>
    <table border="1" width="800px">
        <tr>
            <td style="width:80%">Text</td>
            <td>Rate</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.text}</td>
                <td>${a.rate}</td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" onclick="location.href='${pageContext.request.contextPath}/comment/addComment?name=${name}&restaurant=${restaurant}';" value="Write Comment" />
    <input type="button" onclick="location.href='${pageContext.request.contextPath}/restaurant.jsp';" value="Home" />
</center>
</body>
</html>