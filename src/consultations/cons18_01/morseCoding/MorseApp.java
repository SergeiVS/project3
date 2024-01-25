package consultations.cons18_01.morseCoding;

import consultations.cons18_01.morseCoding.services.Services;

public class MorseApp {
    public static void main(String[] args) {
        Services services = new Services();
        String messageToCode = "Привет, у нас получилось!";

        System.out.println(services.codingMachine(messageToCode, true));

    }
}
