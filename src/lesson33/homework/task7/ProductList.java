package homework.task7;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    //Дана коллекция Product - название, категория, цена, количество на складе.
    //   Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
    //   и отсортировать по убыванию цены
   private final List <ProductT7> productList;

    public ProductList() {
        this.productList = new ArrayList<>();
    }

    public List<ProductT7> getProductList() {
        return productList;
    }
    public Double avgPriceByDenomination(List<ProductT7> database, String searchedDenomination){

        return database.stream()
                .filter(p -> p.getDenomination().equals(searchedDenomination))
                .
    }
}
