package lesson6.exercise3;

public class TillTheEndOfTheWork {
    public static void main(String[] args) {

double n = Math.random() * (28800 + 1);

        System.out.println("Till the end of the work is only " + (int)n + " seconds.");

        if (n >= 3600) {
            System.out.println("Till the end of the work is only " + (int) (n / 3600) + " hours.");
        } else {
            System.out.println("Till the end of the work is less than 1 hour.");
        }
    }

}
