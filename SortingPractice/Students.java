package SortingPractice;

public class Students implements  Comparable<Students>{

    protected String name;
    protected int age;
    protected double marks;

    public Students(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student's Name is: "+ name + " Age : " + age + "Marks: "+ marks;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(this.age,o.age);
    }
}
