package lessoncode.shopinglist.ui;

import UtilsStatic.UserInputStatic;

import java.util.List;

public class UserMenu {
    private final List<MenuCommand> commands;

    public UserMenu(List<MenuCommand> commands) {
        this.commands = commands;
    }

    public void startUserMenu() {
        boolean goOn = true;
        while (goOn) {
            for (int i = 0; i < commands.size(); i++) {
                System.out.println(i + ". " + commands.get(i).getMenuName());
            }
            int userInput = UserInputStatic.inputInt("Make your choice: ");
            goOn = commands.get(userInput).executeCommand();

        }
    }
}
