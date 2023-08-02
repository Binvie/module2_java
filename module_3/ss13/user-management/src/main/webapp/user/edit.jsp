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
<h1>Edit User</h1>
<p><a href="/UserServlet" methods="">Back to user list</a></p>
<form method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="name" value="${user.name}"></td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="email" value="${user.email}"></td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="country" value="${user.country}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="submit" value="Update user"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
