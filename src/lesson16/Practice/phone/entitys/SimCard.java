package Practice.phone.entitys;

public class SimCard {
    private int phoneNumber;
    private String[] sms = new String[10];

    public SimCard(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getSms() {
        return sms;
    }

    public void setSms(String[] sms) {
        this.sms = sms;
    }
}
