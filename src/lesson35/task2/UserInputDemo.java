package task2;

import java.io.IOException;

public class UserInputDemo {
    public static void main(String[] args) throws IOException {
        UserIntoFileInput uI = new UserIntoFileInput();
        User user1 = uI.userInput();
        User user2 = uI.userInput();
        System.out.println();
        System.out.println(user1);
        System.out.println();
        System.out.println(user2);
        System.out.println();

        System.out.println(uI.userWriteToFile(user1));
        System.out.println(uI.userWriteToFile(user2));
    }
}
