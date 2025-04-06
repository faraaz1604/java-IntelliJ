package AbstractChallenge;

public class Electronics extends ProductForSale{
    public Electronics(String type, double prize, String description) {
        super(type, prize, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Electronic Item: " + getType() + "\n" +
                "Specs: " + getDescription() + "\n" +
                "Price: $" + getPrize() + "\n");
    }
}
