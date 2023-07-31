<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit customer</title>
</head>
<body>
<h1>Edit customer</h1>
<p>
  <c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
  </c:if>
</p>
<p>
  <a href="/customers">Back to customer list</a>
</p>
<form action="customers?action=edit&id=${customer.getId()}" method="post">
  <fieldset>
    <legend>Customer information</legend>
    <table>
      <tr>
        <td><label for="name">Name: </label></td>
        <td><input type="text" name="name" id="name" value="${customer.getName()}"></td>
      </tr>
      <tr>
        <td><label for="email">Email: </label></td>
        <td><input type="text" name="email" id="email" value="${customer.getEmail()}"></td>
      </tr>
      <tr>
        <td><label for="address">Address: </label></td>
        <td><input type="text" name="address" id="address" value="${customer.getAddress()}"></td>
      </tr>
      <tr>
        <td><label for="status">Status: </label></td>
        <td><input type="text" name="status" id="status" value="${customer.getCustomerStatus()}"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Update customer"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>