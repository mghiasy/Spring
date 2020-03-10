<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add a Book</title>
</head>
<body>
<form action="../book/${book.id}" method="post">
    <table>
        <tr>
            <td>Make:</td>
            <td><input type="text" name="Title" value="${book.title}" /> </td>
        </tr>
        <tr>
            <td>Model:</td>
            <td><input type="text" name="ISBN" value="${book.ISBN}" /> </td>
        </tr>
        <tr>
            <td>Year:</td>
            <td><input type="text" name="Price" value="${book.price}" /> </td>
        </tr>
        <tr>
            <td>Color:</td>
            <td><input type="text" name="Author" value="${book.author}" /> </td>
        </tr>
    </table>
    <input type="submit" value="update"/>
</form>
<%--<form action="../book/${book.id}" method="delete">--%>
<form action="delete?bookId=${book.id}" method="post">
    <button type="submit">Delete</button>
</form>
</body>
</html>