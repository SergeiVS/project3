package lesson7.homework.task31;

public class DivisionOn5 {
    public static void main(String[] args) {

        int i = 1;

        do {
            i++;
            if (i % 5 == 0) {System.out.print(i + ", ");}
        }
        while (i <= 100);
    }
    }