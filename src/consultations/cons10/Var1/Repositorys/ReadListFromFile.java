package Var1.Repositorys;

import Var1.entitys.LibraryItem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadListFromFile {
   private final RepositoryInterface anInterface;

    public ReadListFromFile(RepositoryInterface anInterface) {
        this.anInterface = anInterface;
    }


    public List<LibraryItem> readFromFile(String path, RepositoryInterface repository) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        line = reader.readLine();
            if (line.contains("{") && line.contains("}")){


            }
            if (line.contains("{") && !line.contains("}")){

            }
            return
    }
}
