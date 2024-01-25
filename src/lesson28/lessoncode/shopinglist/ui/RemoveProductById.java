package lessoncode.shopinglist.ui;

import UtilsStatic.UserInputStatic;
import lessoncode.shopinglist.dto.ResponseRemoveProduct;
import lessoncode.shopinglist.service.ProductService;

public class RemoveProductById implements MenuCommand{

    private final ProductService service;
    public RemoveProductById(ProductService service) {
        this.service = service;
    }
    @Override
    public Boolean executeCommand() {
        Integer id = UserInputStatic.inputInt("Insert id to remove");

        ResponseRemoveProduct removeProduct = service.removeProduct(id);
        System.out.println(removeProduct);
        return true;
    }

    @Override
    public String getMenuName() {
        return "Remove product by id";
    }
}
