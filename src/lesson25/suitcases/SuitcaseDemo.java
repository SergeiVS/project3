package suitcases;

import java.util.*;

public class SuitcaseDemo {
    public static void main(String[] args) {

MyComporator myComporator = new MyComporator();

    LinkedList<lesson25.suitcases.Suitcase> suitcaseArrayList = new LinkedList<>();
suitcaseArrayList.add(new lesson25.suitcases.Suitcase("Plastic","XL", "Black"));
suitcaseArrayList.add(new lesson25.suitcases.Suitcase("Plastic", "M", "Blue"));
suitcaseArrayList.add(new lesson25.suitcases.Suitcase("Fabric", "L", "Green"));
suitcaseArrayList.add(new lesson25.suitcases.Suitcase("Lether", "M", "Brown"));

        System.out.println(suitcaseArrayList);

Set<lesson25.suitcases.Suitcase> suitcaseSet = new TreeSet<>(myComporator.getSuitcaseComparator());

suitcaseSet.addAll(suitcaseArrayList);
        System.out.println(suitcaseSet);

        suitcaseArrayList.sort(myComporator.getSuitcaseComparator());

        System.out.println(suitcaseArrayList);

}
}
