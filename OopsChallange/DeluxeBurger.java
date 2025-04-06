package OopsChallange;

public class DeluxeBurger extends Burger{

    private static final double DELUXE_PRICE = 200.00;

    public DeluxeBurger() {
        super("Deluxe Burger", DELUXE_PRICE);
    }

    @Override
    public void addToppings(String topping, double price) {
        if(super.getToppingSize() <= 5){
            super.addToppings(topping, 0);
        }
        else System.out.println("Cant add more than 5 toppings to a deluxe Burger");
    }
}
