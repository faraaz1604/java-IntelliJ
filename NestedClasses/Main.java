package NestedClasses;

public class Main {

    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Mohamed Faraaz")
                .setEmail("mohadfz08@gamil.com")
                .setPhone(232233232L)
                .build();

        user.display();


        Product product = new Product.Builder()
                .setId(21)
                .setName("pen")
                .build();
        product.displayProduct();



        Book book = new Book.Builder()
                .setTitle("Java Deep Dive")
                .setAuthor("Faraaz Khan")
                .setIsbn("123-4567891234")
                .setPrice(499.99)
                .setGenre("Programming")
                .build();

        book.displayBook();


    }


}
