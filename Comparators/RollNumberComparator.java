package Comparators;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Students> {


    @Override
    public int compare(Students s1, Students s2) {
        return s1.getRollNum() - s2.getRollNum();
    }
}
