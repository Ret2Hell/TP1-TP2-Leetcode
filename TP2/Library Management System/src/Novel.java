public class Novel extends Book
{
    private String title,author;
    private int year,nbrpage;
    public Novel(String title,String author,int year,int nbrpage)
    {
        super(title,author,year);
        this.nbrpage=nbrpage;
    }
    public void displayInformation()
    {
        super.displayInformation();
        System.out.println("Nombre de pages: " +nbrpage+"\n");
    }

}