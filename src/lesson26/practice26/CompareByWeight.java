import java.util.Comparator;

public class CompareByWeight implements Comparator<Box> {

        @Override
        public int compare(Box b1, Box b2) {
            return Double.compare(b1.getWeight(), b2.getWeight());
        }

}
