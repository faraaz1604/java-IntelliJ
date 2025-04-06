package Polymorphism.challenge;

public class ElectricCar extends Car{
    
    private double avgKmPreCharge;
    private int batterSize;

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("..electric car engine started silently");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("electric car engine is running silently");
    }
}
