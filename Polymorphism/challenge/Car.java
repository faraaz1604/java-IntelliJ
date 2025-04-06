package Polymorphism.challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> starting");
    }

    public void drive(){
        System.out.println("Car is driving, type is "+ getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }

}

