package Comparators;

import java.util.Comparator;

public class NameComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        return s1.compareTo(s2);
    }
}
