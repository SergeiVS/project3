package lessoncode.messanger;

public class Telegram  implements Messanger {

    @Override
    public void sendMessage() {
        System.out.println("your Telegram message sent");
    }

    @Override
    public void getMessage() {
        System.out.println("Telegram message");
    }
}
