package task5;

import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        PrimeNumberInterface numberCheck = new PrimeNumberInterface() {
            @Override
            public boolean primeCheck(int number) {
                boolean isPrime = true;
                for (int i = 2; i < number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                return isPrime;
            }
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("insert number: ");
        int n = scanner.nextInt();

        System.out.println("Number: " + n + " is prime- " + numberCheck.primeCheck(n));
    }
}
