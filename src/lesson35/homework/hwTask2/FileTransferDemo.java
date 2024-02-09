package homework.hwTask2;

import java.io.IOException;

public class FileTransferDemo {
    public static void main(String[] args) throws IOException {


        String sourcePath = "src/lesson35/homework/TestFile.txt";
        String destinationPath = "src/lesson35/homework/hwTask2/TestFileNew.txt";

        FileContentTransfer transfer = new FileContentTransfer();

        transfer.contentTransfer(sourcePath, destinationPath);
    }

}
