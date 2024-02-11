package homework.hwTask3;

import homework.hwTask3.entity.User;
import homework.hwTask3.repository.ReadDataFromCsv;
import homework.hwTask3.repository.UserMap;
import homework.hwTask3.services.RepositoryService;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;

public class UserDatabaseTest {
    public static void main(String[] args) throws IOException {

        String path = "src/lesson35/homework/hwTask3/source/access-code.csv";
        UserMap userMap = new UserMap();
        RepositoryService service = new RepositoryService();
        Map<Integer, User> mapOfUser = userMap.getUserMap();

        mapOfUser.putAll(ReadDataFromCsv.extractUserDataFromCsv(path));
        System.out.println(userMap.getUserMap());
        System.out.println();

        List<User> usersList = RepositoryService.usersToList(mapOfUser);
        System.out.println(usersList);
        System.out.println();

        Double sumAccountValue = RepositoryService.sumOfValues(usersList);
        System.out.println("sum of all accounts values is: " + sumAccountValue);
        System.out.println();

        List<User> usersJohnson = RepositoryService.findUsersByLastname(usersList, "Johnson");

        OptionalDouble avgAccountValue = RepositoryService.avgAccountValue(usersJohnson);
        System.out.println("average user account value of Johnson's is: " + avgAccountValue);
        System.out.println();

        User userForChangeValue = RepositoryService.findById(mapOfUser,207074);
        System.out.println(userForChangeValue);
        System.out.println();

        userForChangeValue.setAccountValue(745.0);
        System.out.println(userForChangeValue);

    }
}
