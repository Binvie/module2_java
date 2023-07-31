<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 7/31/2023
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new product</h1>
<p>
  <c:if test='${message}!=null'>
    <span class="message">${"message"}</span>
  </c:if>
</p>
<p>
  <a href="/Product">Back to product list</a>
</p>
<form method="post">
  <fieldset>
    <legend>Product information</legend>
    <table>
      <tr>
        <td><label for="name">Name: </label></td>
        <td><input type="text" name="name" id="name" value="${product.getName()}"></td>
      </tr>
      <tr>
        <td><label for="price">Price: </label></td>
        <td><input type="text" name="price" id="price" value="${product.getPrice()}"></td>
      </tr>
      <tr>
        <td><label for="description">Description: </label></td>
        <td><input type="text" name="description" id="description" value="${product.getDescription()}"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Create Product"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
