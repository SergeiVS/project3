package lessoncode.shopinglist.ui;

public class ExitMenu implements MenuCommand {
    @Override
    public Boolean executeCommand() {

        System.out.println("Bye-bye!");
        return false;
    }

    @Override
    public String getMenuName() {
        return "Exit";
    }
}
