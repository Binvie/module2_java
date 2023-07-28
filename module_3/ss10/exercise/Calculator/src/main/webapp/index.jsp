<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/CalculatorServlet" method="get">
    <fieldset style="width: 50%">
        <legend>Calculator</legend>
        <table>
            <tr>
                <td><label for="id1">First operand: </label></td>
                <td><input type="number" name="number1" id="id1"></td>
            </tr>
            <tr>
                <td><label for="id2"> Operator: </label></td>
                <td><select name="operator" id="id2">
                    <option value="+">Addition</option>
                    <option value="-">Subtraction</option>
                    <option value="*">Multiplication</option>
                    <option value="/">division</option>
                </select></td>
            </tr>
            <tr>
                <td><label for="id3">Second operand: </label></td>
                <td><input type="number" name="number2" id="id3"></td>
            </tr>
        </table>
        <input type="submit" value="Calculate">
    </fieldset>
</form>

</body>
</html>