package BookStoreMs;

public class Book {
    private String genres;
    private String name;
    private String author;
    private double price;

    public Book(String genres, String name, String author, double price) {
        this.setGenres(genres);
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(){

    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    double discount() {
        if (getGenres().equalsIgnoreCase("fiction")) {
            double discountprice = price - (.25 * price);
            return discountprice;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genres='" + genres + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
