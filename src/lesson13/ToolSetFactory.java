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
        System.out.println(Arrays.toString(toolList));

        for (int i = 0; i < setSize; i++) {

            System.out.print("Please insert tool ID from the list above: ");
            toolId = scanner.nextInt();
            toolSet[i] = toolList[toolId];
        }
        return toolSet;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public ToolsListFactory[] getToolList() {
        return toolList;
    }

    public void setToolList(ToolsListFactory[] toolList) {
        this.toolList = toolList;
    }
}
