package Interfaces.challenge1;

public class Car implements Vehicle{
    @Override
    public void engineStarts() {
        System.out.println(getClass().getSimpleName() + " engine is starting");
    }
}
