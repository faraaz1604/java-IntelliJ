package NestedClasses;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private double price;
    private String genre;

    private Book(){}

    public static class Builder{
        private String title;
        private String author;
        private String isbn;
        private double price;
        private String genre;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;

        }

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;

        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;

        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;

        }

        public Book build(){

            if(this.author == null || this.title == null){
                throw new IllegalArgumentException("oye title aur author kone tera baap dale ga");
            }

            Book book = new Book();
            book.author = this.author;
            book.title = this.title;
            book.genre = this.genre;
            book.isbn = this.isbn;
            book.price = this.price;

            return book;

        }
    }

    public void displayBook(){
        System.out.println("author: " + author);
        System.out.println("title: " + title);
        System.out.println("genre: " + (genre != null? genre: "Unknown"));
        System.out.println("isbn: " + (isbn != null ? isbn: "N/A"));
        System.out.println("price: " + (price > 0 ? price: "not set"));
    }
}
