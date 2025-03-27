import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DeleteBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bookIdStr = request.getParameter("bookId");

        if (bookIdStr == null || bookIdStr.isEmpty()) {
            response.getWriter().println("Book ID is required for deletion.");
            return;
        }

        try {
            int bookId = Integer.parseInt(bookIdStr);

            HttpSession session = request.getSession();
            List<Book> books = (List<Book>) session.getAttribute("books");

            if (books == null) {
                books = new ArrayList<>();
            }

            Book bookToDelete = null;
            for (Book book : books) {
                if (book.getBookId() == bookId) {
                    bookToDelete = book;
                    break;
                }
            }

            if (bookToDelete != null) {
                books.remove(bookToDelete);
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
