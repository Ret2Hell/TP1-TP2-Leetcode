public class Book
{
    private String title,author;
    private int year;
    public Book(String title,String author,int year)
    {
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getYearOfPublication()
    {
        return year;
    }
    public void displayInformation()
    {
        System.out.println("Title: "+ title +"\nAuthor: "+ author +"\nYear of publication: " + year);
    }


}