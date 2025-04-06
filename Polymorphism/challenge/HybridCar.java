package Polymorphism.challenge;

public class HybridCar extends Car{
    private double avgKmPreLiter;
    private int batterSize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("..Hybrid Engine is starting");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("..hybrid car moving");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("hybrid car started Running");
    }
}
