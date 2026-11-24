package OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library 
{
    private static List<Book> libraryCollection = new ArrayList<>();

    public static void addBook(Book book)
    {
        libraryCollection.add(book);
    }

    public static Optional<Book> findBookDetails(String title)
    {
        return libraryCollection.stream().filter(book->book.getTitle().equalsIgnoreCase(title)).findFirst();
    }

    public static void listAllBooks()
    {
        if(libraryCollection.isEmpty())
        {
            System.out.println("No books are stored in the Library");
        }
        else{
            for(Book books :libraryCollection)
            {
                System.out.println(books.getTitle()+" by "+books.getAuthor()+" -$"+books.getPrice());
            }
        }
        
    }
}
