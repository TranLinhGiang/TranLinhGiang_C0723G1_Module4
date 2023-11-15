<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/15/2023
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1> Sandwich Condiment</h1>
<form action="/condiment" method="post">

        <input type="checkbox" name="condiment" value="Lettuce"> Lettuce
        <input type="checkbox" name="condiment" value="Tomato"> Tomato
        <input type="checkbox" name="condiment" value="Mustard"> Mustard
        <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
    <hr>
    <input type="submit">
    <p> Result: ${result}</p>

</form>
</body>
</html>
