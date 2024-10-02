<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
    <h3>Write Comment</h3>
    <form action="${pageContext.request.contextPath}/comment/insertComment">
        Text:<input type="text" name="text"><br>
        Rate:<input type="text" name="rate"><br>
        <input type="hidden" name="name" value="${name}">
        <input type="hidden" name="restaurant" value=${restaurant}>
        <br>
        <input type="submit" value="submit">
    </form>
</center>
