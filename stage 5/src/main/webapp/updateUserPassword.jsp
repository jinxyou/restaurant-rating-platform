<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
    <h3>Update Password</h3>
    <form action="${pageContext.request.contextPath}/user/performUpdate">
        Username: <input type="text" name="username" value="${user.username}" readonly><br>
        Password:<input type="text" name="password" value="${user.password}"><br>
        <br>
        <input type="submit" value="Submit">
    </form>
</center>
