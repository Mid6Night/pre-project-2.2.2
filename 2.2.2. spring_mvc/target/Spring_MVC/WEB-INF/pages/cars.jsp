<%--
  Created by IntelliJ IDEA.
  User: nitro
  Date: 11.06.2020
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cars</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>
    <%=request.getAttribute("locale")%>
</h1>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Model</th>
        <th>Number</th>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>
                    ${car.getName()}
            </td>
            <td>
                    ${car.getModel()}
            </td>
            <td>
                    ${car.getNumber()}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
