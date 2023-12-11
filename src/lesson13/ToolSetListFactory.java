import java.util.Scanner;

public class ToolSetListFactory {

    public ToolSetListFactory(int listSize) {
Scanner scanner = new Scanner(System.in);
        ToolSetFactory[] setList = new ToolSetFactory[listSize];
        for (int i = 0; i < listSize; i++) {
            System.out.println();
            setList[i] = new ToolSetFactory().getToolList();
        }
    }

}
