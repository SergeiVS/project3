package task3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class ProductCatalog {
    private final Map<String, Double> productCatalog = new HashMap<>();

    private String noSuchProduct = "Catalog do not contain product ";

    public void addProductToCatalog(Product product){
        productCatalog.put(product.getProductName(), product.getPrice());
    }

    public Map<String, Double> getProductCatalog() {
        return productCatalog;
    }
public String searchProductByName(String productName){

        if (productCatalog.containsKey(productName))
        {return "searched product`s " + productName + " price is "  + productCatalog.get(productName);}
        else {return  noSuchProduct + productName;}
}

public void removeProductFromCatalog(String productName){
    if (productCatalog.containsKey(productName)){

    productCatalog.remove(productName);
    System.out.println("Product " + productName + " is removed fromCatalog");

    }
    else {System.out.println(noSuchProduct + productName);}
}

}
