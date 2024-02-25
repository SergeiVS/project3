package lessonCode.OrderService;

import java.util.Objects;

public class Order {

    private String name;
    private String product;

    private Integer quantity;

    public Order(String name, String product, Integer quantity) {
        this.name = name;
        this.product = product;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getName(), order.getName()) && Objects.equals(getProduct(), order.getProduct()) && Objects.equals(getQuantity(), order.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getProduct(), getQuantity());
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
