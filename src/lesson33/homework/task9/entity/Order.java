package task9.entity;

import task9.entity.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    //Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
    //   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.

    private Integer orderId;
    private LocalDate orderDate;
    private Double amount;
    private OrderStatus status;

    public Order(Integer orderId, Double amount, String date, OrderStatus status) {
        this.orderId = orderId;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.orderDate = LocalDate.parse(date, formatter);
        this.amount = amount;
        this.status = status;
    }


    public Integer getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderId=" + orderId +
                ", orderDate=" + orderDate +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
