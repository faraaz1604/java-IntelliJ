package AbstractChallenge;

import java.util.ArrayList;

public class Store {

    private ArrayList<ProductForSale> productForSale = new ArrayList<>();
    private ArrayList<OrderItem> order = new ArrayList<>();


    public void addItem(ProductForSale item){
        productForSale.add(item);
    }

    public void addToOrder(ProductForSale product, int qnt){
        order.add(new OrderItem(qnt, product));
    }

    public void listProducts(){
        for (ProductForSale p : productForSale){
             p.showDetails();
        }
    }

    public void printOrderReceipt(){
        for (OrderItem item : order){
             item.product().printPricedItem(item.qty());
        }
    }

    public static void main(String[] args) {
        Store store = new Store();

        ProductForSale book = new Book("Java Book", 49.99, "Learn Java with examples");
        ProductForSale laptop = new Electronics("Laptop", 999.99, "16GB RAM, 512GB SSD");
        ProductForSale tshirt = new Clothing("T-Shirt", 19.99, "Cotton, size M");

        store.addItem(book);
        store.addItem(laptop);
        store.addItem(tshirt);

        System.out.println("=== Available Products ===");
        store.listProducts();

        store.addToOrder(book, 2);
        store.addToOrder(tshirt, 3);

        store.printOrderReceipt();
    }
}










