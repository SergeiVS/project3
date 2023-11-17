package homeworkLesson5.exercise2;

import java.util.Scanner;

public class WordMixing {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String word1 = input.nextLine();

        System.out.println(" ");

        System.out.println("The first word is: " +  word1);

        System.out.println(" ");


        String word2 = input.nextLine();

        System.out.println("The second word is: " + word2);

        System.out.println(" ");

         int word1Length = word1.length();

         int word2Length = word2.length();

         String word1Substring = word1.substring(0,word1Length / 2);

         String word2Substring = word2.substring((word2Length / 2) + (word2Length % 2), word2Length);

        System.out.println(word1Substring + word2Substring);





    }
}
