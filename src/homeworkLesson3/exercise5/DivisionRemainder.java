package homeworkLesson3.exercise5;

public class DivisionRemainder {

    public static void main(String[] args) {


        int x;

        int y;

        int counter = 1;

        //All possible division remainder for divisor = 2


        y = 2;

        x = 0;

        int rem1 = x % y;

        x = x + 1;

        int rem2 = x % y;

        System.out.println("Possible remainder by division on 2 are " + rem1 + " and " + rem2);


        //All possible division remainder for divisor = 3


        y = 3;

        x = 0;

        rem1 = x % y;

        x = x + 1;


        rem2 = x % y;

        x = x + 1;

        System.out.println(x);

        int rem3 = x % y;


        System.out.println("Possible remainder by division on 3 are " + rem1 + ", " + rem2 + " and " + rem3);


        // На этом месте можно было бы сделать через цыкл один универсальный метод на любой делитель


        System.out.println("Possible remainder by division on 2 are: ");

        for (int i = 0; i < y; i++) {

            y = 2;

                    int rem = i % y;


            System.out.println("remainder " + counter + " = " + rem);

            counter = counter + 1;

        }
    }

}
