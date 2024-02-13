package task9.repository;


import task9.entity.Order;
import task9.entity.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderBook {
    private final List<Order> orderBook;
    Integer idCounter = 0;

    public OrderBook() {
        this.orderBook = new ArrayList<>();
    }

    private Integer idGenerator(){
        return idCounter++;
    }
    public Optional<Order> enterNewOrder(Double amount, String date, OrderStatus status){
        if (dateValidation(date)){
        int id = idGenerator();
        return Optional.of(new Order(id, amount, status, date));
        }else {
            return Optional.empty();
        }
    }
    private String addOrderToBook(List<Optional<Order>> orderBook, Optional<Order> order){
        order.ifPresent(value -> orderBook.add(Optional.of(value)));
        if (orderBook.contains(order)) {
            return "Order is added";
        } else {
            return "Order not added";
        }
    }

    private static String orderAddValidation(List<Order> orderBook, Order order) {
        if (orderBook.contains(order)){
            return "Order is added";
        }else {
            return "Internal error, order is not added";
        }
    }
    private static boolean dateValidation (String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate;
        boolean isValid = true;
        try {
           localDate = (LocalDate) formatter.parse(date);
        }catch (Exception e){
            isValid = false;
        }

return isValid;
    }

}
