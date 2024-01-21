package task4;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class OrderService {


    private Map<Integer, Order> orderMap = new TreeMap<>();

    public void addOrder(Order order){
        orderMap.put(order.getOrderNumber(), order);
    }

    public void addDishToOrder(Integer orderId, Dish dish, Integer numberOfUnits){

        for (int i = 0; i < numberOfUnits; i++) {
            orderMap.get(orderId).getOrderedDishes().add(dish);
        }
    }
    public void removeOrder(Integer oderId){
        orderMap.remove(oderId);

    }

    public Map<Integer, Order> getOrderMap() {
        return orderMap;
    }
}
