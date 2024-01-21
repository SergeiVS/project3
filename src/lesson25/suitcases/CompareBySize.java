package suitcases;

import lesson25.suitcases.Suitcase;

import java.util.Comparator;

public class CompareBySize implements Comparator<lesson25.suitcases.Suitcase> {
    @Override
    public int compare(Suitcase o1, Suitcase o2) {

        return o1.getSizeOfCase().compareTo(o2.getSizeOfCase());
    }
}
