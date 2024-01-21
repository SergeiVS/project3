package task4;

import java.util.*;

public class Order {
    private  Integer orderNumber;

    private Integer tableNumber;

    private List<Dish> orderedDishes;

    public Order(Integer orderNumber, Integer tableNumber) {
        this.orderNumber = orderNumber;
        this.tableNumber = tableNumber;
        this.orderedDishes = new ArrayList<>();

    }

    public void setOrderedDishes() {
        this.orderedDishes = new LinkedList<>();
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public List<Dish> getOrderedDishes() {
        return orderedDishes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(orderNumber, order.orderNumber) && Objects.equals(tableNumber, order.tableNumber) && Objects.equals(orderedDishes, order.orderedDishes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, tableNumber, orderedDishes);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", tableNumber=" + tableNumber +
                ", orderDishes=" + orderedDishes +
                '}';
    }
}









