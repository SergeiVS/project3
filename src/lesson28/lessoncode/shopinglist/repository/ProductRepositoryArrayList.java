package lessoncode.shopinglist.repository;


import lessoncode.shopinglist.dto.ProductDto;
import lessoncode.shopinglist.entity.Product;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductRepositoryArrayList implements lessoncode.shopinglist.repository.ProductRepository {

    private List<Product> database;

    private Integer idCounter;

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();
        this.idCounter = 0;
    }

    @Override
    public Integer addProduct(ProductDto productDto) {
        idCounter++;
        database.add(new Product(idCounter, productDto.getProductName(), productDto.getPrice(), productDto.getDescription()));
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return database;
    }

    @Override
    public Product findById(Integer id) {

        for (Product currentProduct : database) {
            if (currentProduct.getId().equals(id)) {
                return currentProduct;
            }
        }
        return null;
    }

    @Override
    public Boolean removeProductFromDB(Integer id) {
        Iterator<Product> iterator = database.listIterator();
       Product productForRemove = null;
       while (iterator.hasNext()) {
           productForRemove = iterator.next();
           if (productForRemove.getId().equals(id)) {
               iterator.remove();
               return true;
           }
       }
        return false;
    }
}
