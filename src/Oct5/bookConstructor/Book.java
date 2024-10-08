package Oct5.bookConstructor;

public class Book {

    String title;
    String author;
    int yearPublished;
    double price;
    String genre;

    public Book(){
        this.title="Code with Gagan";
        this.author = "Gagan";
        this.yearPublished = 2024;
        this.price = 120.00;
        this.genre = "Java";
    }
    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int yearPublished, double price, String genre) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.genre = genre;
    }


}
