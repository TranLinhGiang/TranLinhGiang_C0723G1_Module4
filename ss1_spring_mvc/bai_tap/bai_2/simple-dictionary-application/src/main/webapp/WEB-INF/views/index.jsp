<%--
  Created by IntelliJ IDEA.
  User: TGDD
  Date: 11/14/2023
  Time: 2:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<form action="/index" method="post">
    <h2> EngLish</h2>
    <input type="text" name="word" placeholder="nhap tieng anh vao day">
    <button type="submit"> Search</button>
</form>
<p>
result: ${list}
</p>
</body>
</html>
