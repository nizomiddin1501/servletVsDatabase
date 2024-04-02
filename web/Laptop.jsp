<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3/30/2024
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Laptop</title>
</head>
<body>



<table>
    <tr>
        <th>Model</th>
        <th>Price</th>
    </tr>
    <c:forEach var="laptop" items="${laptopList}">
        <tr>
            <td>${laptop.getModel()}</td>
            <td>${laptop.getPrice()}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
