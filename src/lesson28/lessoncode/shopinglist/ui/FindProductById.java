package lessoncode.shopinglist.ui;

import UtilsStatic.UserInputStatic;
import lessoncode.shopinglist.dto.ResponseForClientFindByIdProduct;
import lessoncode.shopinglist.service.ProductService;

public class FindProductById implements MenuCommand{
    private final ProductService service;
    public FindProductById(ProductService service) {
        this.service = service;
    }
    @Override
    public Boolean executeCommand() {

        int id = UserInputStatic.inputInt("Pleas insert product ID to search");

        ResponseForClientFindByIdProduct findByIdProduct = service.findById(id);
        System.out.println(findByIdProduct);

        return true;
    }

    @Override
    public String getMenuName() {
        return "Find product by ID";
    }

    @Override
    public String toString() {
        return "FindProductById{" +
                "service=" + service +
                '}';
    }
}
