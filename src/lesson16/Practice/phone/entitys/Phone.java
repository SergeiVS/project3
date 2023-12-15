package Practice.phone.entitys;

import phone.entitys.PhoneCover;

public class Phone {
     private Practice.phone.entitys.SimCard[] simCards = new Practice.phone.entitys.SimCard[2];
    private int imei;
    private String phoneName;
    private PhoneCover cover;

    public Phone( int imei, String phoneName) {
        this.imei = imei;
        this.phoneName = phoneName;
    }

    public Practice.phone.entitys.SimCard[] getSimCards() {
        return simCards;
    }

    public void setSimCards(Practice.phone.entitys.SimCard[] simCards) {
        this.simCards = simCards;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getImei() {
        return imei;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public PhoneCover getCover() {
        return cover;
    }

    public void setCover(PhoneCover cover) {
        this.cover = cover;
    }
}
