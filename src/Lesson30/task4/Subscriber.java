package task4;

public class Subscriber {

    private Integer phoneNumber;
    private  String subscriberName;

    public Subscriber(Integer phoneNumber, String subscriberName) {
        this.phoneNumber = phoneNumber;
        this.subscriberName = subscriberName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "phoneNumber=" + phoneNumber +
                ", subscriberName='" + subscriberName + '\'' +
                '}';
    }
}
