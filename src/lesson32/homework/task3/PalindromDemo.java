package task3;

public class PalindromDemo {
    public static void main(String[] args) {
        PalCheck check = new PalCheck();
        String s1 = "Главрыба";
        String s2 = "Egale Lage.";

        System.out.println("String s1 is palindrom " + check.palindromCheck(s1));

        System.out.println("String s2 is palindrom " + check.palindromCheck(s2));
    }
}
