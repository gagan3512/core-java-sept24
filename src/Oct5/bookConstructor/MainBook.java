package Oct5.bookConstructor;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("Code with pragara");
        Book book2 = new Book("Code with harry","harry",2022,100,"code with python");

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
    }
}

//book title, Author,year published, price, genre,
//cnstructor
//default
//1 param
//2 param
//2,3,4,5 parm
//
//create a method print all the details of the book