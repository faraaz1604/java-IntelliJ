package OopsChallange;

public class Main {

    public static void main(String[] args) {
        MealOrder defaultMeal = new MealOrder();
        defaultMeal.printReceipt();

        Burger customBurger = new Burger("Cheese loaded", 70);
        customBurger.addToppings("chesse", 20);
        customBurger.addToppings("onions", 10);
        customBurger.addToppings("pickels", 10);
        Drink drink =new Drink("Rohafza","Medium");
        SideItem sideItem = new SideItem("Medium frise", 70.00);
        MealOrder newOrder = new MealOrder(customBurger,drink, sideItem);
        newOrder.printReceipt();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addToppings("Avocado", 0);
        deluxeBurger.addToppings("Onion", 0);
        Drink deluxeDrink = new Drink("Root Beer", "medium");
        SideItem deluxeSide = new SideItem("Sweet Potato Fries", 3.99);
        MealOrder deluxeMeal = new MealOrder(deluxeBurger, deluxeDrink, deluxeSide);
        deluxeMeal.printReceipt();
    }
}
