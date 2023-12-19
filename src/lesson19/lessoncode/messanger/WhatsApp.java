package lessoncode.messanger;

public class WhatsApp implements Messanger {



    @Override
    public void sendMessage() {
        System.out.println("your WhatsApp message sent");
    }

    @Override
    public void getMessage() {
        System.out.println("WhatsApp message");

    }
}
