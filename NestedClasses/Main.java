package NestedClasses;

public class Main {

    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Mohamed Faraaz")
                .setEmail("mohadfz08@gamil.com")
                .setPhone(232233232L)
                .build();

        user.display();
    }


}
