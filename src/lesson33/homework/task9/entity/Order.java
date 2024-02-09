package homework.task9.entity;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Order {
    //Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
    //   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.

private Integer orderId;
private  LocalDate orderDate = null;
private Double amount;
private OrderStatus status;

    public Order(Integer orderId,  Double amount, OrderStatus status,int day, int month) {
        this.orderId = orderId;
        LocalDate date = LocalDate.now();
        date.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.orderDate;
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
