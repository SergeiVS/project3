import java.util.Arrays;
import java.util.Scanner;

public class ToolSetFactory {

    Scanner scanner = new Scanner(System.in);
    Tool tool;
    ToolsListFactory[] toolList;
int arrSize;
    public Tool[] buildSet(Tool[] toolList,int setSize){

        Tool[] toolSet = new Tool[setSize];
        int toolId;
        for (int i = 0; i < setSize; i++) {
            System.out.print("Please insert tool ID from the list above: ");
            toolId = scanner.nextInt();
            toolSet[i] = toolList[toolId];
        }
        return toolSet;
    }





}
