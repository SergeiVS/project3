package task4;

public class FactorialDemo{
    public static void main(String[] args) {
        Integer x = 5;
        Factorial f = new Factorial();
        Long fX = f.factorialCalculation(x);
        System.out.println("Factorial of "+ x + " is " + fX);
    }


}
