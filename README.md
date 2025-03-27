# Library Managemeny System
This is a simple Library Management System built using Java, Servlets, and JSP. It allows librarians to manage books in a library, providing functionalities such as adding, searching, updating, and deleting books. The system also allows books to be listed with their details.

## Features
Add a Book: Add new books by specifying the book's details such as ID, Title, Author, Genre, and Availability Status.

View All Books: Displays a list of all books available in the system.

Search Books by ID or Title: Search for books using either their unique Book ID or Title.

Update Book Details: Modify book details such as Title, Author, Genre, and Availability Status.

Delete a Book: Remove a book from the catalog by its ID.

## Prerequisites
Java (JDK 8 or later)

Servlet Container like Apache Tomcat or any Java EE server


## Getting Started
1. Clone the Repository
bash
Copy
git clone https://github.com/KothaYashwini03/Library_Management_System.git
cd Library_Management_System
2. Set Up Apache Tomcat
Download and install Apache Tomcat (or any Java servlet container) and configure it properly. Ensure that Tomcat is set up to run on your machine. If you're using IntelliJ IDEA, Eclipse, or any IDE, you can easily configure it as your application server.
3. Build the Project
If you are using Maven, you can build the project by running:
bash
Copy
mvn clean install
4. Deploy the Application
Deploy the application to your servlet container (Tomcat or any other Java EE server). You can place your .war file in the webapps directory if you are using Tomcat.
Alternatively, you can directly run it through an IDE like IntelliJ IDEA or Eclipse.
5. Access the Application
Once the server is running, open your browser and visit the following URL:
bash
Copy
http://localhost:8080/Library_Management_System
## Project Structure
Book.java: The model class representing a Book.

BookServlet.java: Servlet to add a new book to the library system.

BookListServlet.java: Servlet to list all books in the system.

UpdateBookServlet.java: Servlet to update book details.

DeleteBookServlet.java: Servlet to delete a book from the system.

SearchBookServlet.java: Servlet to search for books by ID or Title.

index.html: Frontend HTML page to add a book and search for books.

bookList.jsp: JSP page to display a list of books.

searchResults.jsp: JSP page to display the search results.

styles.css: Basic CSS file for styling the application.
## Input Validation
The application ensures that:
Book Title and Author fields are non-empty.
Availability Status is either Available or Checked Out.
Book ID is unique for each book in the catalog.

## How to Use
Add a Book:

Fill in the book details (Title, Author, Genre, Availability) in the form on the home page and click Add Book.

Search for a Book:

Enter the Book ID or Title in the search box and press Search to find books by ID or Title.

View All Books:

All books in the system can be viewed in the "View All Books" section.

Update a Book:

Click on Update beside a book to modify its details.

Delete a Book:

Click on Delete to remove a book from the system.


## How to Improve / Future Features
Database Integration: Currently, the book data is stored in the session, which means the data will be lost once the server is restarted. Implementing a database (e.g., MySQL, PostgreSQL) would allow persistence across sessions.

## User Authentication: 
Implement user authentication to ensure only authorized personnel (librarians) can add, update, or delete books.

## Pagination:
For large numbers of books, implement pagination to improve performance and user experience.

## Advanced Search: 
Add more advanced search options, such as filtering by Genre or Availability status.

## Challenges Faced
Servlet Mapping: Configuring and properly mapping servlets in web.xml can sometimes be confusing, especially for beginners.
Session Management: Storing data in the session was simple, but not ideal for long-term storage. Moving towards a database would be a future improvement.
Frontend Design: Simple frontend design was used for this project. For better user interaction, it could be improved by incorporating frameworks like Bootstrap.

## Conclusion
This Library Management System provides the basic functionality required for managing books in a library. It's designed to be simple and easy to understand, using Java Servlets, JSP, and HTML/CSS. With some improvements, it can be extended to a more feature-rich and production-ready application.
