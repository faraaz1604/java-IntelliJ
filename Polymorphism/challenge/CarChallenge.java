package Polymorphism.challenge;

public class CarChallenge {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarChallenge( int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName()+ "-> startEngine()");
    }

    public void accelerate(){
        System.out.println(getClass().getSimpleName() + "-> accelerate()");
    }

    public void brake(){
        System.out.println(getClass().getSimpleName() + "-> brake()");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
