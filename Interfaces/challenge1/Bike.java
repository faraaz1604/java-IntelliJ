package Interfaces.challenge1;

public class Bike implements  Vehicle{
    @Override
    public void engineStarts() {
        System.out.println(getClass().getSimpleName() + " engine is starting");
    }
}
