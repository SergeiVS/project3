package homework.hwTask3.repository;

import homework.hwTask3.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadDataFromCsv {


//Чтение данных из CSV файла и обработка их
//   Описание: Написать программу на Java, которая будет читать данные из CSV (Comma-Separated Values)
//   файла, используя классы FileReader и BufferedReader, и обрабатывать их.
//   Программа должна способна разбирать строки из файла на поля, разделенные запятыми,
//   и выполнять определенные операции на данных, такие как суммирование, поиск определенных значений и т.д.

    public static Map<Integer, User> extractUserDataFromCsv(String path) throws IOException {
        Map<Integer, User> users = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;

        while ((line = reader.readLine()) != null) {

            UserData usedData = getUserData(line);

            addUserToMap(usedData, users);

        }
        reader.close();
        return users;
    }

    private static void addUserToMap(UserData usedData, Map<Integer, User> users) {
        User user = new User(usedData.id(), usedData.fName(), usedData.lName(), usedData.aValue());
        users.put(user.getIdentifier(), user);
    }

    private static UserData getUserData(String line) {
        String[] strings = line.split(",");
        Integer id = Integer.parseInt(strings[0].trim());
        String fName = strings[1].trim();
        String lName = strings[2].trim();
        Double aValue = Double.parseDouble(strings[3].trim());
        UserData usedData = new UserData(id, fName, lName, aValue);
        return usedData;
    }

    private record UserData(Integer id, String fName, String lName, Double aValue) {
    }
}
