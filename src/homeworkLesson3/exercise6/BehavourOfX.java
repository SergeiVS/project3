package homeworkLesson3.exercise6;

public class BehavourOfX {

    public static void main(String[] args) {

        int x = 3;

        x += x++;

        System.out.println(x);

        // it looks like my program do not understand x++?

        x = 3;

        x += x + 1;

        System.out.println(x);

        // Operator +=, x += y means x = x + y

    }
}
