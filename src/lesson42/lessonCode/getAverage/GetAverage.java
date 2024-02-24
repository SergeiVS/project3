package lessonCode.getAverage;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class GetAverage {

    public Double getAverage(List<Integer> integers){


            OptionalDouble avg = integers.stream()
                    .mapToInt(i -> i)
                    .average();
            if (avg.isPresent()){
            return avg.getAsDouble();
        }
       return 0.0;
    }
}
