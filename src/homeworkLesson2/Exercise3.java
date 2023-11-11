package homeworkLesson2;

public class Exercise3 {

    // Declaration of main method

    public static void main(String[] args) {

        // Declaration of variables

        int a = 583;
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        // calculations

        thirdNumber = a % 10;
        a = a/10;
        secondNumber = a % 10;
        firstNumber = a / 10;

        // output of results

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("thirdNumber = " + thirdNumber);


    }
}
