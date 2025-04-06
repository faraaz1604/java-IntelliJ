package Polymorphism.challenge;

public class GassPoweredCar extends Car{
    
    private double avgKmPerLiter;
    private int cylinders;

    public GassPoweredCar(String description) {
        super(description);

    }

    public GassPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> All %d cylinders are been fired up!%n", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> engine is running good and at avg %.2f %n" , avgKmPerLiter);
    }


}
