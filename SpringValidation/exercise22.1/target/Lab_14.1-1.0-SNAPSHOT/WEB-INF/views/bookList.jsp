<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Books currently in the shop</title>
</head>
<body>
<h1>Books currently in the shop</h1>
<table>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            <td>${book.ISBN}</td>
<%--            <td>${book.publishedDate}</td>--%>
            <td><a href="book/${book.id}">edit</a></td>
        </tr>
    </c:forEach>
</table>

<a href="addBook.jsp"> Add a Book</a>
<%--<a href="books/${book.id}"> Add a Book</a>--%>
</body>
</html>