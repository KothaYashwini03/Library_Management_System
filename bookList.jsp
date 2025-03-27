<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Library Book List</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>List of Books</h1>
    <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Availability</th>
            <th>Actions</th>
        </tr>
        <%
            List<Book> books = (List<Book>) request.getAttribute("books");
            if (books == null) {
                books = new ArrayList<>();
            }
            for (Book book : books) {
        %>
        <tr>
            <td><%= book.getBookId() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getGenre() %></td>
            <td><%= book.getAvailability() %></td>
            <td>
                <a href="updateForm.html?bookId=<%= book.getBookId() %>">Update</a> |
                <a href="DeleteBookServlet?bookId=<%= book.getBookId() %>">Delete</a>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>
