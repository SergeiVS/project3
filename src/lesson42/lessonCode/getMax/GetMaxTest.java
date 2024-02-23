package lessonCode.getMax;

import lessonCode.getAverage.GetAverage;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GetMaxTest {

    @Test
    public void getMax() {
        GetMax getMax = new GetMax();

        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 5, 6, 8, 9, 10, 15));
        Integer expectedResult = 15;
        Integer actualResult = getMax.getMax(integers);

        assertEquals(expectedResult, actualResult);
    }
}