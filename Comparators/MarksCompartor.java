package Comparators;

import java.util.Comparator;

public class MarksCompartor implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o1.getMarks(),o2.getMarks());
    }
}
