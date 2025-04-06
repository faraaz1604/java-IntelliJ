package Interfaces.c2;

public interface AppUser {

    default void logUserType(){
        System.out.println("Logged in as: " + this.getClass().getSimpleName());
    }
}
