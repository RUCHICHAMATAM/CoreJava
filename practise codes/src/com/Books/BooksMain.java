package com.Books;

public class BooksMain {
public static void main(String[] args){
    Books books[]=new Books[6];
    Books books1=new Books("fiction","stephen king","fairy tale",220.3);


    System.out.println(books1.dicountprice(25));
    Books books2=new Books("fiction","stephen king","fairy tale",220.3);
    Books books3=new Books("fiction","stephen king","fairy tale",220.3);
    Books books4=new Books("fiction","stephen king","fairy tale",220.3);
    Books books5=new Books("fiction","stephen king","fairy tale",220.3);
    Books books6=new Books("fiction","stephen king","fairy tale",220.3);


    books[0]=books1;
    books[1]=books2;
    books[2]=books3;
    books[3]=books4;
    books[4]=books5;
    books[5]=books6;
    System.out.println("genres" + "  " + "author" + "  " +" title" + "  " + "price");
    for(int i=0;i<books.length;i++) {
        Books iterated = books[i];
        String genres= iterated.getGenres();
        String author= iterated.getAuthor();
        String title= iterated.getTitle();
        double price=iterated.getPrice();

        System.out.println(genres + " " + author + " " + title + " " + price);
    }
}
}
