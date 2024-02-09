package homework.task9.repository;

import homework.task9.entity.Order;
import homework.task9.entity.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderBook {
    private final List<Order> orderBook;
    Integer idCounter = 0;

    public OrderBook() {
        this.orderBook = new ArrayList<>();
    }

    private Integer idGenerator(){
        return idCounter++;
    }
    public Order addNewOrder(Double amount, LocalDate date, OrderStatus status){
        int id = idGenerator();
        return new Order(id, date, amount,status);
    }
    private String addOrderToBook(List<Order> orderBook, Order order){
        orderBook.add(order);
        return orderAddValidation(orderBook, order);
    }

    private static String orderAddValidation(List<Order> orderBook, Order order) {
        if (orderBook.contains(order)){
            return "Order is added";
        }else {
            return "Internal error, order is not added";
        }
    }

}
