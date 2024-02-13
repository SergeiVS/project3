package task9.repository;


import task9.entity.Order;

import java.time.Month;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepositoryServices {

//Дан список объектов Order, содержащий информацию о заказах, включая идентификатор, дату, сумму и статус.
    //   Необходимо сгруппировать заказы по месяцам и посчитать общую сумму заказов в каждом месяце.

    static Map<Month, Double> ordersAmountSumByMonth(List<Order> orderBook, Integer year) {
        return orderBook.stream()
                .filter(order -> order.getOrderDate().getYear() == year)
                .collect(Collectors.groupingBy(o -> (o.getOrderDate().getMonth()), Collectors.summingDouble(Order::getAmount)));
    }
}
