package service;

import Practice.phone.entitys.Phone;
import Practice.phone.entitys.SimCard;
import phone.entitys.PhoneCover;

public class PhoneService {

    public boolean insertSimCard(Phone phone, SimCard simCard){

        if (phone.getSimCards()[0] == null) {
            phone.getSimCards()[0] = simCard;
            return true;
        } else if (phone.getSimCards()[1] == null){
            phone.getSimCards()[1] = simCard;
            return true;}
        else {return false;}
    }

    public SimCard removeSimCard(Phone phone, int cellNumber) {
        SimCard removedSimCard = phone.getSimCards()[cellNumber];
        phone.getSimCards()[cellNumber] =null;
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard, int cellNumber){

        SimCard removerSim = removeSimCard(phone,cellNumber);
        int oldNumber = removerSim.getPhoneNumber();
        removerSim.setPhoneNumber(0);
        newSimCard.setPhoneNumber(oldNumber);
        insertSimCard(phone, newSimCard);

        return removerSim;
    }

    public boolean receivedSms(Phone phone, String message, int cellNumber){

        String[] ourSmsMessages = phone.getSimCards()[cellNumber].getSms();
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

    public boolean deleteSmsMessage(Phone phone, int smsNumber, int cellNimber){
        if (smsNumber >= 0 && smsNumber < 10) {
            phone.getSimCards()[cellNimber].getSms()[smsNumber] = null;
            return true;
        } else {
            System.out.println("Нет сообщения с таким номером!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone, int cellNumber) {
        String[] newSmsMessages = new String[10];
        phone.getSimCards()[cellNumber].setSms(newSmsMessages);
        return true;
    }
    public boolean setPhoneCover(Phone phone, PhoneCover cover){
        if (phone.getCover() == null){
            phone.setCover(cover);
            return true;
        }else  return false;
    }
    public boolean removePhoneCover(Phone phone){
        if (phone.getCover() != null){
            phone.setCover(null);
            return false;
        }else  return true;
    }

}
