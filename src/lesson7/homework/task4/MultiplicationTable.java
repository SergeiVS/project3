package lesson7.homework.task4;

public class MultiplicationTable {

    public static void main(String[] args) {

        int a = 1;
        System.out.println("Multiplication table");

        while (a < 10){

            for (int i = 1; i < 10; i++) { System.out.print(a * i + " | ");}

            a++;

            System.out.println(" "); }

    }
}
