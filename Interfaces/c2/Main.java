package Interfaces.c2;

public class Main {

    public static void main(String[] args) {

        AppUser admin = new Admin();
        admin.logUserType();
        AppUser guest = new Guest();
        guest.logUserType();
        AppUser registeredUser = new RegisteredUser();
        registeredUser.logUserType();
    }
}
