<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
    <h3>Add Dish</h3>
    <form action="${pageContext.request.contextPath}/dish/insertDish">
        Id:<input type="text" name="restaurant" value=${id} readonly><br>
        name:<input type="text" name="name"><br>
        price:<input type="text" name="price"><br>
        <br>
        <input type="submit" value="submit">
    </form>
</center>
