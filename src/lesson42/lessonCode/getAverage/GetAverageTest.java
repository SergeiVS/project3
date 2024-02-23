package lessonCode.getAverage;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GetAverageTest {

    @Test
    public void getAverage() {
        GetAverage getAverage = new GetAverage();

        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 5, 6, 8, 9, 10, 15));
        Double expectedResult = 7.857;
        Double actualResult = getAverage.getAverage(integers);

        assertEquals(expectedResult, actualResult, 0.001);
    }
}