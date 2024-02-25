package lessonCode.OrderService;

import java.util.List;

public class OrderService {

    OderDatabase database = new OderDatabase();

    public void placeOrder(String name, String product, Integer quantity){

        Order newOrder = new Order(name, product, quantity);
        database.addOrder(newOrder);
    }
}
