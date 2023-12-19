package lessoncode.messanger;

public class Viber  implements Messanger {



    @Override
    public void sendMessage() {
        System.out.println("your Viber message sent");
    }

    @Override
    public void getMessage() {
        System.out.println("Viber message");
    }
}
