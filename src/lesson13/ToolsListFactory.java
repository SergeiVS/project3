import java.util.Scanner;

public class ToolsListFactory {

ToolsListFactory[] toolList;

    public Tool[] getToolsListToolsList( int arrSize){

        Scanner scanner = new Scanner(System.in);
        Tool[] toolsList = new Tool[arrSize];
        int id;
        String name;
        int numberInStock;

        for (int i = 0; i < arrSize; i++) {
            id = i;
            System.out.print("Please insert tool`s name: ");
            name = scanner.nextLine();
            System.out.print("Please mark presents in stock (true/false): ");
            numberInStock = scanner.nextInt();

           toolsList[i] = new Tool(id, name, numberInStock);
        }
        return toolsList;
    }


}
