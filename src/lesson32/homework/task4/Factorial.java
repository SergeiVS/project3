package task4;

import java.util.stream.LongStream;

public class Factorial implements  FactorialInterface{
    @Override
    public Long factorialCalculation(Integer integer) {
        return LongStream.rangeClosed(1, integer)
                .reduce(1, (long x, long y) -> x * y);
    }
}
