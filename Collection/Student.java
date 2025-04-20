package Collection;

public class Student implements Comparable<Student>{

    private String name;
    private double gpa;
    private int age;

    public Student(String name, double gpa, int age) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student student) {
        return Double.compare(this.age, student.age);
    }

    @Override
    public String toString() {
        return "name " + name + "|" + " gpa "  + gpa + "|" + " Age " + age;
    }
}
