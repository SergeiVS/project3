package task4;

import java.util.Map;

public class Accounting {
    OrderService orderService = new OrderService();
    public void clientsBill(Integer orderId, Map<Integer, Order> orderMap){
        Order order = orderMap.get(orderId);
        Double totalToPay = 0.00;
        System.out.println("oder # " + order.getOrderNumber() + " table: " + order.getTableNumber());
        for (int i = 0; i < order.getOrderedDishes().size(); i++) {
            Dish dish = order.getOrderedDishes().get(i);
            System.out.println(dish.getDishName() + "___" + dish.getPrice() + " Eur.");
            totalToPay += dish.getPrice();
        }
        System.out.println("TOTAL____________________" + totalToPay);
    }
}
