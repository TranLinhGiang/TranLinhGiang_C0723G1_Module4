<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/14/2023
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chuyển đổi tiền tệ</h1>
<br>
<form action="/submit">
    <label for="VND"></label>
    <input type="number" name="vnd" id="VND" value=""> VND
    <br>
    <button type="submit">Tính ra kết quả</button>
    <br>
    <p>
        result = ${usd} USD
    </p>
</form>
</body>
</html>
