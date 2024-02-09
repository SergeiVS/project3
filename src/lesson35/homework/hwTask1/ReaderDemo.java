package homework.hwTask1;

import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/lesson35/homework/TestFile.txt";

        ReadText readText = new ReadText();
        readText.printTextFromFile(path);
    }
}
