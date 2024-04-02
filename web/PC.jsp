<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>PC</title>
</head>
<body>

<table border="1">
    <tr>
        <th>Model</th>
        <th>Price</th>
    </tr>
    <c:if test="${not empty pcList}">
        <c:forEach items="${pcList}" var="pc" >
            <tr>
                <td>${pc.model}</td>
                <td>${pc.price}</td>
            </tr>
        </c:forEach>
    </c:if>
    <c:if test="${empty pcList}">
        <tr>
            <td colspan="2">No data available</td>
        </tr>
    </c:if>
</table>

</body>
</html>
