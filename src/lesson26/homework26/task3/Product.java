package task3;

import java.util.Objects;

public class Product {
    private final String productName;
    private Double price;

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(productName, product.productName) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }
}
