public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Book book1=new Book("A Dance with Dragons","George R. R. Martin",2011);
        Book book2=new Novel("Harry Potter and the Goblet of Fire","J. K. Rowling",2000,281);
        Book book3=new Textbook("Moby-Dick","Herman Melville",1851 ,"Adventure fiction epic");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.showBooks();

        Student student=new Student("Mohamed Yassine","Tayeb",20, "1234","gl2",5678);
        Teacher teacher = new Teacher("Mongi", "Mhamdi", 48, "0001", "Physics", 9846);
        student.borrowBook(book1, library);
        System.out.println("After borrowing:\n");
        library.showBooks();
        student.returnBook(book1, library);
        System.out.println("After returning:\n");
        library.showBooks();
        teacher.borrowBook(book2, library);
        System.out.println("After teacher borrowing:\n");
        library.showBooks();
        teacher.returnBook(book2, library);
        System.out.println("After teacher returning:\n");
        library.showBooks();
    }
}
