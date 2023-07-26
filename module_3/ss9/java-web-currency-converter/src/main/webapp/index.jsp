<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/Java-Web-Currency-Converter" method="post">
<h1>Currency Converter</h1>
<div>
    <label>Rate:</label>
    <br>
    <input type="text" name="rate" placeholder="RATE" value="22000">
    <br>
    <input type="text" name="usd" placeholder="USD" value="0">
    <br>
    <input type="submit" id="submit" value="Convert">
</div>
<br/>
</form>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>