package task4;

import java.util.stream.LongStream;

public class FactorialDemo{

    public static void main(String[] args) {

        FactorialInterface factorial = n -> LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);

        Integer x = 5;
        //Factorial f = new Factorial();
        Long fX = factorial.factorialCalculation(x);
        System.out.println("Factorial of "+ x + " is " + fX);
    }


}
