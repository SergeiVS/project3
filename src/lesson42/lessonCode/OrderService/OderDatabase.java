package lessonCode.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OderDatabase {

    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }
}


