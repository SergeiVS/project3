package task4;

import java.util.LinkedList;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        OrderService oD = new OrderService();
        Accounting accounting = new Accounting();

        Dish dish1 = new Dish(11, "French fries", 5.80);
        Dish dish2 = new Dish(21, "Sushi rolls", 13.50);
        Dish dish3 = new Dish(22, "Meat balls", 18.40);
        Dish dish4 = new Dish(14, "Mix salade", 6.70);

        menu.addDishToMenu(dish1);
        menu.addDishToMenu(dish2);
        menu.addDishToMenu(dish3);
        menu.addDishToMenu(dish4);

        Order order1 = new Order(1, 5);
        Order order2 = new Order(2,4);

        oD.addOrder(order1);
        oD.addOrder(order2);

        oD.addDishToOrder(1, dish1, 2);
        oD.addDishToOrder(1, dish3, 2);
        oD.addDishToOrder(1, dish4,1);

        System.out.println(oD.getOrderMap());
        System.out.println(oD.getOrderMap().get(2));

        oD.removeOrder(2);

        System.out.println(oD.getOrderMap());

        accounting.clientsBill(1, oD.getOrderMap());

    }
}
