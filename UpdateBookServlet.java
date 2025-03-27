import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class UpdateBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookIdStr = request.getParameter("bookId");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String genre = request.getParameter("genre");
        String availability = request.getParameter("availability");

        if (bookIdStr == null || bookIdStr.isEmpty() || title == null || title.trim().isEmpty() || author == null || author.trim().isEmpty()) {
            response.getWriter().println("Invalid input data.");
            return;
        }

        try {
            int bookId = Integer.parseInt(bookIdStr);

            HttpSession session = request.getSession();
            List<Book> books = (List<Book>) session.getAttribute("books");

            if (books == null) {
                books = new ArrayList<>();
            }

            Book bookToUpdate = null;
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    bookToUpdate = book;
                    break;
                }
            }

            if (bookToUpdate != null) {
                bookToUpdate.setTitle(title);
                bookToUpdate.setAuthor(author);
                bookToUpdate.setGenre(genre);
                bookToUpdate.setAvailability(availability);
                session.setAttribute("books", books);
                response.sendRedirect(request.getContextPath() + "/bookList.html");
            } else {
                response.getWriter().println("Book not found.");
            }
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid Book ID format.");
        }
    }
}
