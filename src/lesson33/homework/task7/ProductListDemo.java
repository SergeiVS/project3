package homework.task7;

import homework.task2.StringsCollectionDemo;

import java.util.List;
import java.util.Map;

public class ProductListDemo {
    public static void main(String[] args) {

        ProductList productList = new ProductList();

        List<ProductT7> products = productList.getProductList();
        products.add(new ProductT7("Product1", "Category1", 100.00,50));
        products.add(new ProductT7("Product2", "Category1", 300.00,150));
        products.add(new ProductT7("Product3", "Category2", 50.00,250));
        products.add(new ProductT7("Product4", "Category2", 40.00,20));
        products.add(new ProductT7("Product5", "Category1", 400.00,80));
        products.add(new ProductT7("Product6", "Category2", 500.00,90));
        products.add(new ProductT7("Product7", "Category3", 30.00,300));
        products.add(new ProductT7("Product8", "Category3", 700.00,50));
        products.add(new ProductT7("Product9", "Category3", 230.00,780));

        List<ProductT7> productsByCriteria = productList.productsByInStockQuantity(products, 60);

        StringsCollectionDemo.printList(products);
        System.out.println();
        StringsCollectionDemo.printList(productsByCriteria);
        System.out.println();

        Map<String, Double> avgPriceByCategory = productList.avgPriceByCategory(productsByCriteria);

        System.out.println(avgPriceByCategory);
    }
}
