package suitcases;

import lesson25.suitcases.Suitcase;

import java.util.Comparator;

public class MyComporator {
    CompareByMaterial byMaterial = new CompareByMaterial();
    CompareByColor byColor = new CompareByColor();
    CompareBySize bySize = new CompareBySize();

   private Comparator<Suitcase> suitcaseComparator = bySize.thenComparing(byMaterial.thenComparing(byColor));

    public Comparator<Suitcase> getSuitcaseComparator() {
        return suitcaseComparator;
    }
}
