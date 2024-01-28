package task4;

public class PhoneNumbersDatabaseTest {
    public static void main(String[] args) {


        PhoneNumbersDatabase database = new PhoneNumbersDatabase();
        Subscriber subscriber1 = new Subscriber(154258741, "Johnson");
        Subscriber subscriber2 = new Subscriber(1456322887, "Peterson");
        Subscriber subscriber3 = new Subscriber(145879652, "Svenson");
        Subscriber subscriber4 = new Subscriber(158778997, "Peterson");

        database.getSubscribers().put(subscriber1.getPhoneNumber(), subscriber1);
        database.getSubscribers().put(subscriber2.getPhoneNumber(), subscriber2);
        database.getSubscribers().put(subscriber3.getPhoneNumber(), subscriber3);
        database.getSubscribers().put(subscriber4.getPhoneNumber(), subscriber4);

        System.out.println("search present number");
        System.out.println(database.findSubscriberByNumber(154258741));

        System.out.println("search absent number");
        System.out.println(database.findSubscriberByNumber(256311));

        System.out.println("search by present name");
        System.out.println(database.findSubscribersByName("Peterson"));
        System.out.println("search by absent name");
        System.out.println(database.findSubscribersByName("Edison"));
    }
}
