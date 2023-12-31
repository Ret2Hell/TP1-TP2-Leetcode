public class Textbook extends Book
{
    private String title,author,type;
    private int year;
    public Textbook(String title,String author,int year,String type)
    {
        super(title,author,year);
        this.type=type;
    }

    public void displayInformation()
    {
        super.displayInformation();
        System.out.println("Type: " +type+"\n");
    }

}