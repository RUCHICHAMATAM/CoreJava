package BookStoreMs;

import java.util.ArrayList;

public class BookStore {


    Book[] books=new Book[3];
    int index;

   public  Book add(String genres, String name, String author, double price) {
        Book book = new Book(genres, name, author, price);

        books[index] = book;
        index++;


        return book;
    }
    public Book[] findallbooks(){
       return books;
    }

    public Book findbyname(String name) {

        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    /*  Book[] findbygenres(String name){
           Book desired[]=new Book[index];
           int i=0;
           for(Book book:books){
               if(book.getGenres().equalsIgnoreCase(name)){
                   desired[i]=book;
                   i++;
               }
           }

           int len = desired.length;
           if (len > 0) {
               return desired;
           }
           return null;

   }*/
   public  ArrayList<Book> findbygenres(String genres) {
        //Book desired[] = new Book[2];
       ArrayList <Book> desired=new ArrayList<>();
        int k=0;
       System.out.println(books.length);
       for(int i=0;i<books.length;i++){
           if(books[i].getGenres().equalsIgnoreCase(genres)){
              // desired[k]=books[i];
               desired.add(books[i]);
               k++;
           }
       }
       return desired;

    }
    public double totalcost(String name){
       double cost=0;
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                if(book.getGenres().equalsIgnoreCase("fiction")){
                    cost=cost+ book.discount();
                }

                 else {
                    cost =cost+ book.getPrice();
                }


            }
        }
       return cost;
    }
}


