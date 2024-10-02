<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
    <h3>Login</h3>
    ${err}
    <form action="${pageContext.request.contextPath}/user/login">
        Username:<input type="text" name="username"><br>
        Password:<input type="text" name="password"><br>
        <br>
        <input type="submit" value="Submit">
    </form>
    <form action="register.jsp">
        <input type="submit" value="Register" />
    </form>
</center>
