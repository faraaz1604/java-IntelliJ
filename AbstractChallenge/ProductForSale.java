package AbstractChallenge;

public abstract class ProductForSale {

    private String type;
    private double prize;
    private String description;

    public ProductForSale(String type, double prize, String description) {
        this.type = type;
        this.prize = prize;
        this.description = description;
    }

    public void printPricedItem(int qty){
        System.out.printf("%-10s | Qty: %d |Unit Prize: %.2f | Total: %.2f",type,qty,prize,getSalesPrice(qty));

    }

    public double getSalesPrice(int qty){
       return prize*qty;
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrize() {
        return prize;
    }

    public String getDescription() {
        return description;
    }


}
