package com.Books;

public class Books {
  private  String genres;
  private  String author;
   private String title;
   private double price;
   public Books() {
   }

    public Books(String genres, String author, String title, double price) {
        this.genres = genres;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    double dicountprice(int value){
        System.out.println("value"+value);
        System.out.println("price"+price);
       double priceTemp=price-(value*price)/100;
       // double priceTemp=price-(value*price)/100;
        setPrice(priceTemp);

        System.out.println("price after discount"+priceTemp);
        return price;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
