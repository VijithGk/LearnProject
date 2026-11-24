package OOPS;

import java.util.Optional;
import java.util.Scanner;

public class BooksUI 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book details in the format Title:Author:Price: ");
        String userInput = sc.next();
        String arr[] = userInput.split(":");
        String title = arr[0];
        String author = arr[1];
        double price = Double.parseDouble(arr[2]);

        Library.addBook(new Book(title, author, price));
        

        System.out.println("\nEnter a book title to search:");
        String searchTitle = sc.nextLine();
        Optional<Book> bookOpt = Library.findBookDetails(searchTitle);
    
            
        if (bookOpt.isPresent())
        {
            Book book = bookOpt.get();
            System.out.println("Book Found: " + book.getTitle() + 
                                   " by " + book.getAuthor() + 
                                   " - $" + book.getPrice());
        } 
        else 
        {
            System.out.println("Book not found with title: " + searchTitle);
        }
    
            
            System.out.println("\nBooks in Library:");
           Runnable listBooks = Library::listAllBooks;
           listBooks.run();
   
            sc.close();
    }
}

