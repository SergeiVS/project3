package lessonCode.customerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }

    public CustomerRepository() {
        this.customers = new ArrayList<>();
    }
}
