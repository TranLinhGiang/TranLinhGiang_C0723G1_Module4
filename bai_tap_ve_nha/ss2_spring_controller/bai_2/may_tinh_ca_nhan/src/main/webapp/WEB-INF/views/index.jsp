<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/21/2023
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Calculator</h1>
<form action="/tinh" method="post">
    <input type="number" name="num1" placeholder="nhap mot so">
    <input type="number" name="num2" placeholder="nhap mot so">
    <br>
    <br>
    <button name="calculator" value="addition">+</button>
    <button name="calculator" value="subtraction">-</button>
    <button name="calculator" value="multiplication">x</button>
    <button name="calculator" value="division">/</button>
    <button>Result</button>
</form>
<p>${result}</p>
</body>
</html>
