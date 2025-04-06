package Polymorphism.challenge;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car("2022 model lamborgini 6 cylinders");
//        runRace(car);

        Car lamborgini = new GassPoweredCar("2022 model lamborgini 6 cylinders",4.59,6);
        runRace(lamborgini);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
