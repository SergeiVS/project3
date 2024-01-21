import java.util.Comparator;

public class CompareByVolume implements Comparator<Box> {
    @Override
    public int compare(Box o1, Box o2) {
        return Double.compare(o1.boxVolume(o1), o2.boxVolume(o2));
    }
}
