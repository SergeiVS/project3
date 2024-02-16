



import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileToList {

    public void readFromFile(String path, List<PersonItem> persons) throws FileNotFoundException {

        try (Scanner scanner = new Scanner(new File(path));){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.contains("{")){
                    String[] strings = scanner.nextLine().split(":");
                    String name = strings[1].trim().replace(",", "");
                    strings = scanner.nextLine().split(":");
                    int age = Integer.parseInt(strings[1].trim());
                    persons.add(new PersonItem(name, age));
                }
            }
        }
    }

}
