<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/dictionary" method="post">
<h2>Vietnamese Dictionary</h2>
    <input type="text"  name="txtSearch" placeholder="Enter your word :">
    <input type="submit" id="submit" value="Search">
</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>