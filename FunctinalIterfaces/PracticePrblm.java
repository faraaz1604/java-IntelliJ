package FunctinalIterfaces;

@FunctionalInterface
public interface PracticePrblm {

    int doTheMath(int a, int b);

    default String greet(String name){
        return "Hello "+name;
    }

    static void info() {
        System.out.println("This is a functional interface");
    }


}
