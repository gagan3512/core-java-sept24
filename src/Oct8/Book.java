package Oct8;

public class Book {
    private String title;
    private String author;

    // Default constructor
    public Book() {
        this("Unknown");  // Calls the constructor with one parameter
    }

    // Constructor with one parameter (title)
    public Book(String title) {
        this(title, "Unknown");  // Calls the constructor with two parameters
    }

    // Constructor with two parameters (title, author)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author);
    }

    public static void main(String[] args) {
        // Create instances using different constructors
        Book defaultBook = new Book();
        Book singleParamBook = new Book("The Alchemist");
        Book fullBook = new Book("1984", "George Orwell");

        // Display the book details
        defaultBook.displayBookDetails();      // Output: Title: Unknown, Author: Unknown
        singleParamBook.displayBookDetails();  // Output: Title: The Alchemist, Author: Unknown
        fullBook.displayBookDetails();         // Output: Title: 1984, Author: George Orwell
    }
}
