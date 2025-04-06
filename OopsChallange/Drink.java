package OopsChallange;

public class Drink {

    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        setSize(size);
    }

    public void setSize(String size) {
        this.size = size;
        switch (size.toLowerCase()){
            case "small" -> this.price = 20.00;
            case "medium" -> this.price = 30.00;
            case "large" -> this.price = 50.00;
            default -> throw new IllegalArgumentException("Invalid size "+ size);
        }
    }

    public double getPrice() {
        return price;
    }


    public String printDetails() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price Rs =" + price +
                '}';
    }
}
