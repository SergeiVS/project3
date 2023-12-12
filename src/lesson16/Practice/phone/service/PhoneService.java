package Practice.phone.service;

import Practice.phone.entitys.Phone;
import Practice.phone.entitys.SimCard;
import phone.entitys.PhoneCover;

public class PhoneService {

    public boolean insertSimCard(Phone phone, SimCard simCard){
        if (simCard.getPhoneNumber() != 0) {
            phone.setSimCards(simCard);
            return true;
        } else {
            return false;
        }
    }

    public SimCard removeSimCard(Phone phone, int simNumber) {
        SimCard removedSimCard = phone.getSimCards()[simNumber];
        phone.setSimCards(null);
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard, int simNumber){
        SimCard removedSimCard = phone.getSimCards()[simNumber];
        int oldNumber = removedSimCard.getPhoneNumber();
        newSimCard.setPhoneNumber[simNumber](oldNumber);
        phone.setSimCards(newSimCards);
        removedSimCard.setPhoneNumber(0);
        return removedSimCard;

    }

    public boolean receivedSms(Phone phone, String message, int simNumber){

        String[] ourSmsMessages = phone.getSimCards()[simNumber].getSms();
        int emptyCell = firstEmptyCell(ourSmsMessages);
        if (emptyCell == -1) {
            System.out.println("Нет памяти для новой смс. Удалите прошлые сообщения!");
            return false;
        } else {
            ourSmsMessages[emptyCell] = message;
            return true;
        }
    }

    private int firstEmptyCell(String[] messages){
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteSmsMessage(Phone phone, int smsNumber, int simNimber){
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCards()[simNimber].getSms()[smsNumber] = null;
            return true;
        } else {
            System.out.println("Нет сообщения с таким номером!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone, int simNumber) {
        String[] newSmsMessages = new String[10];
        phone.getSimCards()[simNumber].setSms(newSmsMessages);
        return true;
    }
    public boolean setPhoneCover(Phone phone, PhoneCover cover){
        if (phone.getCover() == null){
            phone.setCover(cover);
            return true;
        }else  return false;
    }

}
