<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Add a Book</title>
</head>
<body>
<!--
form action="books" method="post">
-->
<form:form commandName="book">
	<table>
		<tr>
			<td>Title:</td>
			<td><form:input name="title" /> </td>
		</tr>
		<tr>
			<td>ISBN:</td>
			<td><form:input  name="ISBN" /> </td>
		</tr>
		<tr>
			<td>Author:</td>
			<td><form:input  name="author" /> </td>
		</tr>
		<tr>
			<td>Price:</td>
			<td><form:input  name="price" /> </td>
		</tr>
		<tr>
            <td>Price:</td>
            <td><form:input type="date" id="start" name="publishedDate"> </td>
        </tr>
	</table>
	<input type="submit"/>

</form:form>
</body>
</html>