package FunctinalIterfaces;

import NestedClasses.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMission {
    public static void main(String[] args) {
        Supplier<String> otpGenerator = () -> {
            return "Faraaz-" + (int)(Math.random() * 10000);
        };

        System.out.println("Generated OTP: " + otpGenerator.get());


        Supplier<Integer> randomGen = () -> (int) (Math.random()*100)+1;
        System.out.println(randomGen.get());

        Supplier<List<String>> objCreaction = () -> new ArrayList<>(List.of("One", "Two", "Three"));
        System.out.println(objCreaction.get());

//        public Supplier<User> createUserFactory(String name) {
//            return () -> new User(name);
//        }
//
//        Supplier<User> faraazFactory = createUserFactory("Faraaz");
//        User user = faraazFactory.get();
    }
}
