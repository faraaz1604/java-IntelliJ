package Polymorphism;

public class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "something funny happens",
                "something more funny happens",
                "happy ending");


    }
}
