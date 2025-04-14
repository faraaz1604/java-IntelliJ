package SortingPractice;

public class Product {

    String name;
    double price;
    String rating;

    public Product(String name, double price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + "|" + price + "|" + rating;
    }
}
