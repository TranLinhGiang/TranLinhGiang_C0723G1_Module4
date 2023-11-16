<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>
<form:form modelAttribute="mailBook" action="update" method="post">
<h1>Setting</h1>
<table border="1">
    <tr>
        <td>
            Languages:
        </td>
        <td>
            <form:select path="language">
                <form:options items="${languageList}"></form:options>
            </form:select>
        </td>
    </tr>
    <tr>
        <td>
            Page Size:
        </td>
        <td>
            Show
        </td>
        <td>
            <form:select path="size">
                <form:options items="${sizeList}"></form:options>
            </form:select>
        </td>
        <td>
            emails per page
        </td>
    </tr>

    <tr>
        <td>
            Spams filter:
        </td>
        <td>
            <form:checkbox path="filter" value="${mailBook.filter}"/>
        </td>
        <td>
            Enable spam filter
        </td>

    <tr>
        <td>
            Signature:
        </td>
        <td>
            <form:input path="signature"></form:input>
        </td>
    </tr>
    <tr>
        <td>
            <form:button>Update</form:button>
        </td>
        <td>
            <form:button>cancel</form:button>
        </td>
    </tr>
    </form:form>

</body>
</html>