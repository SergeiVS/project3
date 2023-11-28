package lesson7.homework.task3;

import java.util.Random;

public class CowDemo {
    public static void main(String[] args) {

    Cow cow = new Cow();
    Random random = new Random();
        System.out.println(cow.cow(random.nextInt(1000)));
}
}