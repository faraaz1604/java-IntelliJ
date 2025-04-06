package OopsChallange;

public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    public MealOrder() {
        this.burger = new Burger("small", 50.00);
        this.drink = new Drink("lemon soda", "Small");
        this.sideItem = new SideItem("small fries", 50.00);
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void printReceipt(){
        System.out.println("-------- Bills-Burger---------");
        System.out.println(burger.printDetails());
        System.out.println(drink.printDetails());
        System.out.println(sideItem.printDetails());
        double total = burger.getTotalprize()+drink.getPrice()+sideItem.getPrize();
        System.out.printf("Your total is Rs: %.2f%n",total);
        System.out.println("------thank you visit again-------");
    }


}
