package task2;

public class SumDemo {
    public static void main(String[] args) {

SumInterface sum = Integer::sum;

    Integer x = 5;
    Integer y = 15;


        System.out.println("Sum of x and y is: " + sum.sum(x, y));
    }
}
