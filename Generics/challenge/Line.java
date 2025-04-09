package Generics.challenge;

public class Line implements Mappable{

    private String name;
    private Double points;

    public Line(String name, Double points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public void render() {

    }
}
