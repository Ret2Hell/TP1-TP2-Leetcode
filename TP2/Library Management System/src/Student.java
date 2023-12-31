import java.util.ArrayList;
public class Student extends Personne implements LibraryUser {
    private String studentId;
    private String grade;
    private LibraryCard libraryCard;
    private ArrayList<Book> borrowedBooks;

    public Student(String firstName,String lastName,int age,String studentId,String grade,int cardNumber) {
        super(firstName,lastName,age);
        this.studentId=studentId;
        this.grade=grade;
        this.libraryCard=new LibraryCard(cardNumber);
        this.borrowedBooks = new ArrayList<>();
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId=studentId;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade=grade;
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
