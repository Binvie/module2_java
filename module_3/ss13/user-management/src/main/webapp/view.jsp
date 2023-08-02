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
<p>
    <a href="/UserServlet">Back to user list</a>
</p>
<form method="post"></form>
<fieldset>
    <legend>User Information</legend>
    <table>
        <tr>
            <td>Name :</td>
            <td><input type="text" name="name" id="name" value="${user.name}"></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><input type="text" name="email" id="email" value="${user.email}"></td>
        </tr>
        <tr>
            <td>Country :</td>
            <td><input type="text" name="country" id="country" value="${user.country}"></td>
        </tr>
        <tr>
            <td></td>
            <td><a href="/UserServlet"><button>Back to user list</button></a></td>
        </tr>
    </table>
</fieldset>
</body>
</html>
