package homework.task9.repository;

import homework.task9.entity.Order;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class RepositoryServices {

    static List<Order> findOrderBy(List<Order> orderBook, Integer year, Integer month) {

        return orderBook.stream()
                .filter(o -> {
                    String date = o.getOrderDate().format(DateTimeFormatter.ofPattern("MM yyyy"));
                    return date.equals(month + " " + year);
                })
                .toList();

    }
}
