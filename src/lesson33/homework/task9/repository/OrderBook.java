package task9.repository;


import task9.entity.Order;
import task9.entity.OrderStatus;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderBook {
    private final List<Order> orderBook;
    private Integer idCounter = 0;

    public OrderBook() {
        this.orderBook = new ArrayList<>();
    }

    public List<Order> getOrderBook() {
        return orderBook;
    }

    private Integer idGenerator(){
        return idCounter++;
    }
    public Order enterNewOrder(Double amount, String date, OrderStatus status){

        int id = idGenerator();
        return new Order(id, amount, date, status);


    }
    public String addOrderToBook(List<Order> orderBook, Order order){
        if(order != null){
            orderBook.add(order);
            return "Order is added";
        }else {
            return "Error, order not added";
        }
    }


    private static boolean dateValidation (String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        boolean isValid = true;
        LocalDate localDate = (LocalDate) formatter.parse(date);

        return isValid;
    }

}
