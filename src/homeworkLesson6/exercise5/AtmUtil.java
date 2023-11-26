package homeworkLesson6.exercise5;

import java.util.Random;

public class AtmUtil {

   int balance = 0;

   public int getBalance(){
       Random random = new Random();
       return random.nextInt(1000);
   }

    public int getDraw(int balance) {
        for (int i = balance / 2; i > 0; i--) {
            if (balance % i == 0) {return i;}
        }
        return 1;
    }
}



