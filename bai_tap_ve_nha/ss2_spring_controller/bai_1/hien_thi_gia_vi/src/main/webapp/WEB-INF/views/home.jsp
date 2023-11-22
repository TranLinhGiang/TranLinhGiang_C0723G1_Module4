<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/21/2023
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H1>Sandwich Condiments</H1>
<form action="/save" method="post">
    <input type="checkbox" name="save" value="Ca chua">Ca chua
    <input type="checkbox" name="save" value="Dua hau">Dua hau
    <input type="checkbox" name="save" value="Trung">TRung
    <input type="checkbox" name="save" value="Thit">Thit
    <input type="checkbox" name="save" value="Ca">Ca
    <br>
    <button>Save</button>
</form>
<p> Result: ${result}</p>
</body>
</html>
