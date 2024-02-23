package lessonCode.customerService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FindCustomers {
    public Customer findCustomerById(List<Customer> customers, Integer id){
        Optional<Customer> searchedCustomer = customers.stream()
                .filter(customer -> Objects.equals(customer.getId(), id))
                .findFirst();
        if (searchedCustomer.isPresent()){
            return searchedCustomer.get();
        }else {
            return new Customer(0,"Not found");
        }
    }
}
