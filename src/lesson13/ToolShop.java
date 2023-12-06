import java.util.Scanner;

public class ToolShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert number of tools in stock: ");
        int arrSize = scanner.nextInt();

        ToolsListFactory[] toolList = new ToolsListFactory[arrSize];

        System.out.println("Please insert number of tools in set: ");
        int setSize = scanner.nextInt();
        int numberOfSets = scanner.nextInt();
        ToolSetFactory[] toolSet = new ToolSetFactory[setSize];

        for (int i = 0; i < numberOfSets; i++) {

        }


    }
}
