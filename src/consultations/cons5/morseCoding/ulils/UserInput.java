package consultations.cons18_01.morseCoding.ulils;

import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
        public String uiText(String message){
            System.out.println(message);
            return scanner.nextLine();
        }
        public int uiInt(String message){

            System.out.println(message);
            return scanner.nextInt();
        }
}
