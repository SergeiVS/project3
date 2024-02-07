package homework.task7;

import java.util.*;
import java.util.stream.Collectors;

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
    public List<ProductT7> productsByInStockQuantity(List<ProductT7> productList, Integer quantityCriteria){

        return productList.stream()
                .filter(p -> p.getInStock() >= quantityCriteria)
                .toList();
    }

    public Map<String, Double> avgPriceByCategory(List<ProductT7> productList){

        LinkedHashMap<String, Double> collect = (LinkedHashMap<String, Double>) productList.stream()
                .collect(Collectors.groupingBy(
                        ProductT7::getCategory,
                        Collectors.averagingDouble(ProductT7::getPrice)
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new
                ));
return collect;
    }
}
