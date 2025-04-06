package AbstractChallenge;

public class Clothing extends ProductForSale{
    public Clothing(String type, double prize, String description) {
        super(type, prize, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Clothing: " + getType() + "\n" +
                "Fabric Details: " + getDescription() + "\n" +
                "Price: $" + getPrize() + "\n");
    }
}
