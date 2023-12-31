import java.util.ArrayList;
public class Teacher extends Personne implements LibraryUser {
    private String teacherId;
    private String subject;
    private LibraryCard libraryCard;
    private ArrayList<Book> borrowedBooks;

    public Teacher(String firstName,String lastName,int age,String teacherId,String subject,int cardNumber) {
        super(firstName,lastName,age);
        this.teacherId=teacherId;
        this.subject=subject;
        this.libraryCard=new LibraryCard(cardNumber);
        this.borrowedBooks = new ArrayList<>();
    }
    public String getEmployeeId() {
        return teacherId;
    }
    public void setEmployeeId(String employeeId) {
        this.teacherId=employeeId;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject=subject;
    }
    public void borrowBook(Book book,Library library) {
        // Check if the book is in the library
        if (library.BookinLibrary(book)) {
            library.removeBook(book);
            borrowedBooks.add(book);
            System.out.println(firstName+" "+ lastName + " has borrowed " + book.getTitle());
        } else {
            System.out.println("The book is not available in the library.");
        }
    }
    public void returnBook(Book book,Library library) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            library.addBook(book);
            System.out.println(firstName+" "+ lastName + " has returned " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + firstName+" "+ lastName);
        }
    }
}
