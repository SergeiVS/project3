package lessoncode.messanger;

public class PhoneApp {
    public static void main(String[] args) {
Messanger[] messangers = {new Telegram(), new WhatsApp(), new Viber(), new Signal()};
Phone phone = new Phone(messangers);
PhoneUtils utils = new PhoneUtils();
utils.messangersService(messangers);
    }
}
