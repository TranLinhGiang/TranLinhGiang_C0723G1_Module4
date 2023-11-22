<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/20/2023
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search" method="post">
    <input type="text" name="work" placeholder="Nhập tiếng anh vào đây">
    <button>Tìm kiếm</button>
</form>
<p>Dịch sang: ${list}</p>
</body>
</html>
