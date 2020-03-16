<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: maryamghiasvand
  Date: 3/9/20
  Time: 10:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add a Book</title>
</head>
<body>

<%--@elvariable id="book" type="cs544.exercise19.Book"--%>
<form:form action="books" method="post">
    <table>
        <tr>
            <td>Title:</td>
            <td><form:input name="title"  path="title"/> </td>
            <form:errors path="title" cssStyle="color: #ff0000" element="div"/>
        </tr>
        <tr>
            <td>ISBN:</td>
            <td><input type="text" name="ISBN" /> </td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><input type="text" name="author" /> </td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price" /> </td>
        </tr>
<%--        <tr>--%>
<%--            <td>PublishDate:</td>--%>
<%--            <td><input type="text" name="publishDate" /> </td>--%>
<%--        </tr>--%>
    </table>
    <input type="submit"/>

</form:form>
</body>
</html>
