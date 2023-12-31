import java.util.ArrayList;
class Library {
    private ArrayList<Book> library = new ArrayList<>();
    public void addBook(Book book) {
        library.add(book);
    }
    public void removeBook(Book book) {
        library.remove(book);
    }

    public void showBooks() {
        System.out.println("Books: ");
        for (Book book : library) {
            book.displayInformation();
        }
    }
    public boolean BookinLibrary(Book book) {
        return library.contains(book);
    }
}