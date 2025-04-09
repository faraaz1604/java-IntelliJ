package Comparators;

public class Students implements Comparable<Students>{

    private final int rollNum;
    private final String name;
    private final Double marks;

    public Students(int rollNum, String name, Double marks) {
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public Double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return rollNum + " - " + name + " = " + marks;
    }

    @Override
    public int compareTo(Students s) {
        return this.name.length() - s.name.length();
    }
}
