// Define Book Class
public class Book
{

    private long isbn; // Book ISBN
    private String title; // Book Title
    private String author; // Book Author
    private int price; // Book Price

    // Constructor to initialize book information
    public Book(long isbn, String title, String author, int price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters for each field
    public long getISBN()
    {
        return isbn;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getPrice()
    {
        return price;
    }

    public void setISBN(long isbn)
    {
        this.isbn = isbn;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    // Return detailed book information
    public String toString()
    {
        return "ISBN: " + getISBN() + ", Title: " + getTitle() + ", Author: " + getAuthor() + ", Price: " + getPrice();
    }
}