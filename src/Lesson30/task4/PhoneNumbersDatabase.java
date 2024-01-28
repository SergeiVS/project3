package task4;

import java.util.*;

public class PhoneNumbersDatabase {

    private final Map<Integer, Subscriber> subscribers;

    public PhoneNumbersDatabase() {
        subscribers = new HashMap<>();
    }

    public Map<Integer, Subscriber> getSubscribers() {
        return subscribers;
    }



    public Subscriber findSubscriberByNumber(Integer number){

        return subscribers.getOrDefault(number, new Subscriber(0,""));
    }
    public List<Subscriber> findSubscribersByName(String name){

        List<Subscriber> subscribersFound = new ArrayList<>();

        Iterator<Map.Entry<Integer, Subscriber>> iterator = subscribers.entrySet().iterator();

        while (iterator.hasNext()){

            String subscriberName = iterator.next().getValue().getSubscriberName();

                if (subscriberName.equals(name)){
                    subscribersFound.add(iterator.next().getValue());
            }
        }
        return subscribersFound;
    }
}
