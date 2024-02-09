package homework.hwTask2;

import java.io.*;

public class FileContentTransfer {
    // Копирование содержимого одного файла в другой
    //   Описание: Написать программу на Java, которая будет копировать содержимое одного
    //   текстового файла в другой, используя классы FileReader, FileWriter и BufferedReader.
    //   Пользователь должен иметь возможность указать исходный и целевой файлы в качестве аргументов.
    public void contentTransfer(String sourcePath, String destinationPath) throws IOException {

        File file = new File(destinationPath);
        BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
        FileWriter writer = new FileWriter(file);
        String line;

        while ((line = reader.readLine()) != null) {

            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
        if (file.exists()){
            System.out.println("Content transfer completed");
        }else {
            System.out.println("Content transfer denied");
        }
    }
}
