import java.util.Scanner;

public class ToolsListFactory {

ToolsListFactory[] toolList;

    public Tool[] getToolsLis( int arrSize){

        Scanner scanner = new Scanner(System.in);
        Tool[] toolsList = new Tool[arrSize];
        int id;
        String name;
        int numberInStock;

        for (int i = 0; i < arrSize; i++) {
            id = i;
            System.out.print("Please insert tool`s name: ");
            name = scanner.nextLine();
            System.out.print("Please insert number of tools in stock (true/false): ");
            numberInStock = scanner.nextInt();

           toolsList[i] = new Tool(id, name, numberInStock);
        }
        return toolsList;
    }

    public ToolsListFactory[] getToolList() {
        return toolList;
    }

    public void setToolList(ToolsListFactory[] toolList) {
        this.toolList = toolList;
    }
}
