package lessoncode.shopinglist;


import lessoncode.shopinglist.repository.ProductRepository;
import lessoncode.shopinglist.repository.ProductRepositoryArrayList;
import lessoncode.shopinglist.service.ProductService;
import lessoncode.shopinglist.service.Validation;
import lessoncode.shopinglist.ui.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
    public static void main(String[] args) {
// создаем основные классы для работы сервиса

        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();
        ProductService service = new ProductService(repository, validation);


        // создаем классы для формирования пунктов меню

        AddProductMenu addProductMenu = new AddProductMenu(service);
        FindAllProductMenu findAllProductMenu = new FindAllProductMenu(service);
        FindProductById findProductById = new FindProductById(service);
        RemoveProductById removeProductById = new RemoveProductById(service);
        ExitMenu exitMenu = new ExitMenu();

        List<MenuCommand> menuCommands = new ArrayList<>();
        menuCommands.add(addProductMenu);
        menuCommands.add(findAllProductMenu);
        menuCommands.add(findProductById);
        menuCommands.add(removeProductById);
        menuCommands.add(exitMenu);

        UserMenu ui = new UserMenu(menuCommands);
        ui.startUserMenu();

    }
}
