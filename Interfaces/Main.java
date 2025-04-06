package Interfaces;

public class Main {
    public static void main(String[] args) {
        int a = 5 , b=10;

        for ( Calculator c : Calculator.values()){
            System.out.println(c.name() + " : " + c.apply(a,b));
        }
    }
}
