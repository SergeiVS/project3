package lessonCode.OrderService;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test
    public void placeOrder() {

        OrderService service = new OrderService();
        Order expectedResult = new Order("John", "Pizza", 1);
        service.placeOrder("John", "Pizza", 1);
        Order actualResult = service.database.getOrders().getLast();

        assertEquals(expectedResult, actualResult);
    }
}