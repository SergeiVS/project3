package lesson7.homework.task2Programming;

import java.util.Random;

public class QuoterDemo {
    public static void main(String[] args) {
        Quoter quoter = new Quoter();

        Random random = new Random();

        System.out.println(quoter.coordinateFieldQuoter(random.nextInt(-10, 10), random.nextInt(-10, 10) ));
    }
}
