package lessoncode.shopinglist.repository;



import lessoncode.shopinglist.dto.ProductDto;
import lessoncode.shopinglist.entity.Product;

import java.util.List;

public interface ProductRepository {

    Integer addProduct(ProductDto productDto);
    List<Product> findAll();
    Product findById(Integer id);

    Boolean removeProductFromDB(Integer id);

}
