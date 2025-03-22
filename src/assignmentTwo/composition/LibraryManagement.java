package assignmentTwo.composition;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
class Library {
    List<Book> book;

    public Library(){

        book  =new ArrayList<>();
    }
    public void addBook(Book addAllBooks){

        book.add(addAllBooks);
    }
     public void displayBook(){
        if(book.isEmpty()){
            System.out.println("there is no books available");
        }
        else {
            for (Book book1: book) {
                System.out.println("available books are :" + book1.getTitle() + " "+ book1.getAuthor());

            }
        }
     }
      public void clearLibrary(){
        book.clear();
          System.out.println("Library is destroyed. All books are removed");
      }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book("java, ", "Java Author");
        Book book2 = new Book("Python, ", "Python Author");
        Library lib = new Library();
        lib.addBook(book1);
        lib.addBook(book2);
        lib.displayBook();

        // Destroying the library
        lib.clearLibrary();
        System.out.println("Display the books info after destroying library");
        lib.displayBook();
    }
}
