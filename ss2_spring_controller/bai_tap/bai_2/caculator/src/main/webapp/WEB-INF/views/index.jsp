<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/15/2023
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculator" method="post">
<h1>Calculator</h1>
Number 1: <input name="num1" type="number">
Number 2: <input name="num2" type="number">
<br>
<br>
<button name="calculator" value="addition">Addition (+)</button>
<button name="calculator" value="subtraction">Subtraction (-)</button>
<button name="calculator" value="multiplication">Multiplication (x)</button>
<button name="calculator" value="division">Division (/)</button>

</form>
<br>
<p>Result : ${result}</p>
</body>
</html>
