package homework.task7;

import java.util.Objects;

public class ProductT7 {
    //Дана коллекция Product - название, категория, цена, количество на складе.
    //   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
    //   и отсортировать по убыванию цены

    private String name;
    private String category;
    private Double price;
    private  Integer inStock;

    public ProductT7(String name, String denomination, Double price, Integer inStock) {
        this.name = name;
        this.category = denomination;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getInStock() {
        return inStock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setInStock(Integer inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "ProductT7{" +
                "name='" + name + '\'' +
                ", denomination='" + category + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductT7 productT7)) return false;
        return Objects.equals(getName(), productT7.getName()) && Objects.equals(getCategory(), productT7.getCategory()) && Objects.equals(getPrice(), productT7.getPrice()) && Objects.equals(getInStock(), productT7.getInStock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory(), getPrice(), getInStock());
    }
}
