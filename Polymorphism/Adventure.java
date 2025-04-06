package Polymorphism;

public class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(4),
        "Pleasant Scence",
        "Scarry Music",
        "Something bad happens",
        "Hero wins");
    }
}
