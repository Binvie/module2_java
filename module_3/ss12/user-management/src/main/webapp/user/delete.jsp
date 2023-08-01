<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 8/1/2023
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete User</h1>
<p><a href="/UserServlet">Back to user list</a></p>
<c:if test="${message != null}">
    <p style="color: lightcoral">
    ${message}
    </p>
</c:if>
<form action="/UserServlet?action=delete&id=${user.getId()}" method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name :</td>
                <td>${user.getName()}</td>
            </tr>
            <tr>
                <td>Email :</td>
                <td>${user.getEmail()}</td>
            </tr>
            <tr>
                <td>Country :</td>
                <td>${user.getCountry()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete user"></td>
                <td><a href="/UserServlet">Back to user list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
