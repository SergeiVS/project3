package lessoncode.shopinglist.ui;


import lessoncode.shopinglist.dto.ResponseForClientFindAllProducts;
import lessoncode.shopinglist.service.ProductService;

public class FindAllProductMenu implements MenuCommand {

    private final ProductService service;

    public FindAllProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public Boolean executeCommand() {

        ResponseForClientFindAllProducts findAllResult = service.findAll();
        System.out.println(findAllResult);
        return true;

    }

    @Override
    public String getMenuName() {
        return "Find all products";
    }
}
