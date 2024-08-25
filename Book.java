public class Book 
{
    private String title;
    private String author;
    private boolean available;

    public Book (String title, String author)
    {
        this.title=title;
        this.author=author;
        this.available=true;

    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    
    public boolean isAvailable()
    {
        return available;
    }
    
    /**
     * //@param available
     */
    public void setAvailable(boolean available)
    {
        this.available= available;
    }
    public static void main(String[] args)
    {
        Book b1= new Book();
        b1.getTitle();
        b1.getAuthor();
        b1.isAvailable();
    

    }
    
    
}
