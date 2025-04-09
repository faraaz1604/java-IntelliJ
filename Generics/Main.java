package Generics;

public class Main {

    public static void main(String[] args) {

        Product<String, Double> product = new Product<>("Red Bull", 125.0);
        Product<String, Integer> product2 = new Product<>("Movie-Ticket", 150);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
