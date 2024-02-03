package UserInterfase;

public class ExitMenu implements MenuCommandInterface{

    @Override
    public boolean executeCommand() {

        System.out.println("Application will be closed");
        System.out.println("Cao!");
        return false;
    }

    @Override
    public String getCommandName() {
        return "Exit";
    }
}
