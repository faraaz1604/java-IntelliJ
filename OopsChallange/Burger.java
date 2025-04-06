package OopsChallange;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    private String burgerType;
    private double basePrice;
    private List<String> toppings = new ArrayList<>();
    private List<Double> pricePerTopping = new ArrayList<>();

    public Burger(String burgerType, double basePrice) {
        this.burgerType = burgerType;
        this.basePrice = basePrice;
    }

    public void addToppings(String topping, double price){
        if(toppings.size() < 3){
            toppings.add(topping);
            pricePerTopping.add(price);
        }else{
            System.out.println("Cant add more than 3 toppings");
        }
    }

    public double getTotalprize(){
        double total = basePrice;
        for(double prize : pricePerTopping){
            total+=prize;
        }
        return total;
    }


    public String printDetails() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                ", basePrice Rs =" + basePrice +
                ", toppings=" + toppings +
                ", pricePerTopping=" + pricePerTopping +
                '}';
    }

    public int getToppingSize(){
        return toppings.size();
    }

}
