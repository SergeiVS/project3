package homework.hwTask3.services;

import homework.hwTask3.entity.User;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class RepositoryService {

     public static List<User> usersToList( Map<Integer, User> users){
        return users.values().stream()
                .toList();
    }

    public static List<User> findUsersByLastname(List<User> users,String searchedName){
               return users.stream()
                .filter(u -> u.getLastName().equals(searchedName))
                .toList();

    }
    public static User findById(Map<Integer, User> users, Integer id){
        return users.get(id);
    }

    public static OptionalDouble avgAccountValue(List<User> users){
        return users.stream()
                .mapToDouble(User::getAccountValue)
                .average();
    }

     public static Double sumOfValues(List<User> users){
        return users.stream()
                .mapToDouble(User::getAccountValue)
                .sum();
    }


}
