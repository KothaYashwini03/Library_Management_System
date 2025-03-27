import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BookListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Book> books = (List<Book>) session.getAttribute("books");

        if (books == null) {
            books = new ArrayList<>();
        }

        request.setAttribute("books", books);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/bookList.jsp");
        dispatcher.forward(request, response);
    }
}
