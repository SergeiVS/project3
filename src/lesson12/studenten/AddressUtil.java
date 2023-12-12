package studenten;

import lesson12.students.Address;

import java.util.Scanner;

public class AddressUtil {


    public lesson12.students.Address[] addresses(int arrSize) {
        lesson12.students.Address[] adresses = new Address[arrSize];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrSize; i++) {

            adresses[i] = new lesson12.students.Address();
        }
    }
}
