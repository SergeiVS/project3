package homework.hwTask1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadText {
    // Чтение данных из текстового файла и вывод на экран
    //   Описание: Написать программу на Java, которая будет читать данные из текстового файла,
    //   используя классы FileReader и BufferedReader, и выводить их на экран.


    public void printTextFromFile(String path) throws IOException {

        FileReader reader = new FileReader(path);
        BufferedReader bReader = new BufferedReader(reader);
        String line;

        while ((line = bReader.readLine()) != null) {
            System.out.println(line);
        }
        bReader.close();
        reader.close();
    }
}
