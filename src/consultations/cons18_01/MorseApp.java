import services.Services;

public class MorseApp {
    public static void main(String[] args) {
        Services services = new Services();
        String messageToCode = "Привет, у нас получилось!";

        System.out.println(services.codingMachine(messageToCode, true));

    }
}
