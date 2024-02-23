package lessonCode.customerService;

import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class FindCustomersTest {

    @Test
    public void findCustomerById() {
        FindCustomers findCustomers = new FindCustomers();

        CustomerRepository repository = new CustomerRepository();
        List<Customer> customers = repository.getCustomers();
        customers.add(new Customer(1,"John"));
        customers.add(new Customer(5, "Sam"));
        customers.add(new Customer(8,"Jane"));

        Customer expectedResult1 = new Customer(1, "John");
       Customer expectedResult2 = new Customer(0, "Not found");

       Customer actualResult1 = findCustomers.findCustomerById(customers, 1);
       Customer actualResult2 = findCustomers.findCustomerById(customers, 4);

       assertEquals(expectedResult1, actualResult1);
       assertEquals(expectedResult2, actualResult2);
    }
}