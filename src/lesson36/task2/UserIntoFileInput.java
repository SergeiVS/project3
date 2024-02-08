package task2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserIntoFileInput {
    //Создайте класс User (id, name, description)
// Введите от пользователя данные
// создайте файл с названием "UserData_id.txt" и
// сохраните в нем построчно информацию о пользователе с названием полей

    private int idCounter = 0;

    private int getIdCounter(){
       return ++idCounter;
    }


    public User userInput() {
        int id = getIdCounter();


        System.out.println(id);
        String name = "User # " + id;
        System.out.println(name);
        String description = "Description of user # " + id;
        System.out.println(description);

        return new User(id, name, description);
    }

    public String userWriteToFile(User user) throws IOException {
        String destPath = "src/lesson36/task2/userData_" + user.getId() + ".txt";

        FileWriter writer = new FileWriter(destPath);

        writer.write(("Id - " + user.getId() + "\n"));
        writer.write(("Name - " + user.getName() + "\n"));
        writer.write(("Description - " + user.getDescription() + "\n"));

        writer.flush();
        writer.close();
        return "User # " + user.getId() + " is added to " + destPath;
    }

}



