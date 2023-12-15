import java.util.Scanner;

public class UserInput4 {

    public int uiInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
