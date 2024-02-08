package lesson36.task1;

import java.io.*;

public class ReadFileTask1 {

    public static void main(String[] args) throws IOException {
       /* Задание 1.

        1) найдите у себя на компьютере любую картинку .jpeg
        2) откройте файл для чтения
        3) создайте другой файл в нужном каталоге своего проекта
        4) перепишите информацию из первого файла во второй
        5) проверьте второй файл - та ли там картинка?

        */
        String sourcePath = "C:\\Users\\serge\\OneDrive\\Документы\\Scanned Documents\\Begrüßungsscan.jpg";
        String destinationPath = "src/lesson36/task1/Begrüßungsscan.jpg";

        FileInputStream fileInputStream = new FileInputStream(sourcePath);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationPath);

        int byteRead;

        while ((byteRead = fileInputStream.read()) != -1) {

            fileOutputStream.write(byteRead);
        }
        fileOutputStream.close();
        fileInputStream.close();
        System.out.println("File was copied");
    }
}
