package suitcases;

import lesson25.suitcases.Suitcase;

import java.util.Comparator;

public class CompareByColor implements Comparator<lesson25.suitcases.Suitcase> {
    @Override
    public int compare(Suitcase o1, Suitcase o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
