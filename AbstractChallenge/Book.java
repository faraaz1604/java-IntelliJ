package AbstractChallenge;

public class Book extends ProductForSale{
    public Book(String type, double prize, String description) {
        super(type, prize, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + getType() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: Rs" + getPrize() + "\n");
    }
}
