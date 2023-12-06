import java.util.Scanner;

public class ToolSetListFactory {


    public ToolSetFactory[] buildSetList(int setListSize)
    {
        Scanner scanner = new Scanner(System.in);
        //ToolSetFactory[]  toolSet;
        ToolSetFactory[] toolSetList;

        int toolId;
        for (int i = 0; i < setListSize; i++) {

            ToolSetFactory[] toolSetList;
            System.out.print("Please insert tool set size: ");
            int setSize = scanner.nextInt();
            toolSetList[i] = new ToolSetFactory[setSize];
        }
        return toolSetList;
    }
}
