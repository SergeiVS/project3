package lessoncode.messanger;

public class Signal implements Messanger {
    public void sendMessage() {
        System.out.println("your Signal message sent");
    }

    @Override
    public void getMessage() {
        System.out.println("Signal message");
    }
}
