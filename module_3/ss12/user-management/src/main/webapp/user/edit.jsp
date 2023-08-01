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
<form action="Userservlet?action=edit&id=${user.getId()}" method="post">
    <fieldset>
        <legend>User information</legend>
        <table>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="name" >${user.getName()}</td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="email" >${user.getEame()}</td>
            </tr>
            <tr>
                <td>Name :</td>
                <td><input type="text" name="country" >${user.getCountry()}</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="submit" >Update user</td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
