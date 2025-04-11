package NestedClasses;

public class Product {

    private int id;
    private String name;
    private double price;

    private Product(){}

    public static class Builder{

        private int id;
        private String name;
        private double price;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build(){
            Product product = new Product();
            product.id = this.id;
            product.name = this.name;
            product.price = this.price;
            return product;

        }

    }

    public void displayProduct(){
        System.out.println("id: "+id+" name: "+name+" price: "+price);
    }
}
