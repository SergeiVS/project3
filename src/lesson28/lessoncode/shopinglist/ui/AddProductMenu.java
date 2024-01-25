package lessoncode.shopinglist.ui;


import lessoncode.shopinglist.dto.ProductDto;
import lessoncode.shopinglist.dto.ResponseForClientAddProduct;
import lessoncode.shopinglist.service.ProductService;

import java.util.Scanner;

public class AddProductMenu implements MenuCommand {

    private final ProductService service;

    public AddProductMenu(ProductService service) {
        this.service = service;
    }

    @Override
    public Boolean executeCommand() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter product name:");
        String name = scanner.nextLine();
        System.out.println("Please enter product description:");
        String description = scanner.nextLine();
        System.out.println("Please enter product price:");
        Double price = scanner.nextDouble();
        ProductDto productDto = new ProductDto(name, price, description);

        ResponseForClientAddProduct addResult = service.addNewProduct(productDto);
        System.out.println(addResult);
        return true;

    }

    @Override
    public String getMenuName() {
        return "Add new product";
    }
}
