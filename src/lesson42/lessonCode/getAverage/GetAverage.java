package lessonCode.getAverage;

import java.util.List;
import java.util.Optional;

public class GetAverage {

    public Double getAverage(List<Integer> integers){
        int div = integers.size();
        if (div > 0) {
            Integer sum = integers.stream()
                    .reduce(0, (a, b) ->  a + b);
            return (double) sum / div;
        }
       return 0.0;
    }
}
