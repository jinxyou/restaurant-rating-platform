<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
    <h3>Register</h3>
    <form action="${pageContext.request.contextPath}/user/addUser">
        Username:<input type="text" name="username"><br>
        Password:<input type="text" name="password"><br>
        <br>
        <input type="submit" value="submit">
    </form>
</center>
