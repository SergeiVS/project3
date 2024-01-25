package UserInterfase;

import Service.Util.UserInputStatic;

import java.util.List;

public class UserMenu {
public final List<MenuCommandInterface> commandLine;
public final GetTextMenu getTextMenu;

    public UserMenu(List<MenuCommandInterface> commandLine, GetTextMenu getTextMenu) {
        this.commandLine = commandLine;
        this.getTextMenu = getTextMenu;
    }

    public void userMenuCommands(){

        boolean goOn = true;
        System.out.println(getTextMenu.getCommandName());
        getTextMenu.executeCommand();


        while (goOn){

            for (int i = 0; i < commandLine.size(); i++) {
                System.out.println(i + ". " + commandLine.get(i).getCommandName());
            }
            System.out.println("Please choose one option");
            int option = UserInputStatic.inputInt("insert one number from list above");
            if(option >= 0 || option < commandLine.size()){
               goOn = commandLine.get(option).executeCommand();
            }else {
                System.out.println("number is out of marge, please trz again");
            }
        }
    }
}
