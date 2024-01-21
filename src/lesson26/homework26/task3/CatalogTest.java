package task3;

public class CatalogTest {
    public static void main(String[] args) {


    ProductCatalog productCatalog = new ProductCatalog();
    Product product1 = new Product("product1", 25.30);
    Product product2 = new Product("product2", 3.00);
    Product product3= new Product("product3", 526.00);
    Product product4 = new Product("product4", 77.58);
    Product product5 = new Product("product5", 21.35);

    productCatalog.addProductToCatalog(product1);
    productCatalog.addProductToCatalog(product2);
    productCatalog.addProductToCatalog(product3);
    productCatalog.addProductToCatalog(product4);
    productCatalog.addProductToCatalog(product5);

        System.out.println("Product Catalog");
        System.out.println(productCatalog.getProductCatalog());

        System.out.println(productCatalog.searchProductByName(product3.getProductName()));

        productCatalog.removeProductFromCatalog(product4.getProductName());
}
}
