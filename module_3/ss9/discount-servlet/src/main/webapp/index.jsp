<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/DiscountServlet" method="post">
    <h2>Product Discount Calculator </h2><br>
    <label for="id">Product Description :</label><br>
    <input type="text" id="id" placeholder="Product Description"> <br>
    <label>List Price :</label>
    <br>
    <input type="number" name="price" placeholder="input price :"> <br>
    <label>Discount Percent :</label> <br>
    <input type="number" name="percent" placeholder="Percent :"> <br>
    <input type="submit" id="submit" value="Submit">
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>