package task9;

import task9.entity.Order;
import task9.entity.OrderStatus;
import task9.repository.OrderBook;
import task9.repository.RepositoryServices;

import java.time.Month;
import java.util.List;
import java.util.Map;

public class OrderBookDemo {
    public static void main(String[] args) {
        RepositoryServices services = new RepositoryServices();
        OrderBook orderBook = new OrderBook();
        List<Order> orders = orderBook.getOrderBook();

        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(500.00, "15-12-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(300.00, "15-05-2022", OrderStatus.STATUS_PERFORMED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(450.00, "15-01-2022", OrderStatus.STATUS_PERFORMED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(700.00, "15-03-2022", OrderStatus.STATUS_COMPLETED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(540.00, "15-05-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(120.00, "15-01-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(900.00, "15-03-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(1300.00, "15-02-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(8500.00, "15-06-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(5000.00, "15-09-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(4500.00, "15-01-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(5030.00, "15-02-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(5600.00, "15-03-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(2200.00, "15-06-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(2500.00, "15-12-2022", OrderStatus.STATUS_RECEIVED)));
        System.out.println(orderBook.addOrderToBook(orders, orderBook.enterNewOrder(5005.00, "15-12-2022", OrderStatus.STATUS_RECEIVED)));


        Map<Month, Double> ordersSumByMoths = services.ordersAmountSumByMonth(orders, 2022);

        for (Map.Entry<Month, Double> e : ordersSumByMoths.entrySet()) {
            System.out.println("Month: " + e.getKey() + " sum of orders values: " + e.getValue());
        }
    }
}

