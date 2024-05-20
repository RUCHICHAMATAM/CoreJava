package BookStoreApp.UI;
import BookStoreApp.Book.Book;
import  BookStoreApp.BookStore.BookStore;

import java.util.ArrayList;

public class UIMain {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        store.add("love", "stephenking", "fairy tales", 220.30);
        store.add("fiction", "stephen", " tales", 220.30);
        store.add("fiction", "king", "fairy ", 220.30);
        Book[] books = store.findallbooks();
        for (Book book : books) {
            System.out.println(book.getName());
        }
        double bookcost= store.totalcost("stephenking");
        System.out.println("cost of the book="+bookcost);
        Book book = store.findbyname("stephenking");
        System.out.println("book by name=" + book.getAuthor());

        ArrayList<Book> genre = store.findbygenres("fiction");
        //System.out.println(genre.length);
        for (Book obj : genre) {
            System.out.println("books of same genre type=" + obj.getGenres());
        }

        Book book1 = new Book("fiction", "stephen", "tailes", 300.0);
        System.out.println(book1.toString());
    }

}
