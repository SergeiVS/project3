package task4;

import java.util.Objects;

public class Dish {
    private Integer dishId;
    private String dishName;
    private Double price;

    public Dish(Integer dishId, String dishName, Double price) {
        this.dishId = dishId;
        this.dishName = dishName;
        this.price = price;
    }

    public Integer getDishId() {
        return dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dish dish)) return false;
        return Objects.equals(dishId, dish.dishId) && Objects.equals(dishName, dish.dishName) && Objects.equals(price, dish.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishId, dishName, price);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }
}
