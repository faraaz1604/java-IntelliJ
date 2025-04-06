package Inheritance;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
}
