package lessoncode.messanger;

public class PhoneUtils {
    public  void messangersService(Messanger[] messangers){
        for (int i = 0; i < messangers.length; i++) {
            messangers[i].getMessage();
            messangers[i].sendMessage();
        }
    }
}
