package NestedClasses.InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String libName;

    private List<Book> books = new ArrayList<>();

    public Library(String libName) {
        this.libName = libName;
    }

    public class Book{

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Title: " + title + " | Author: " + author + " | From: " + libName;
        }
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void printBooks(){
        for (Book b : books){
            System.out.println(b);
        }

    }



}
