package homework.hwTask3.services;

import homework.hwTask3.entity.User;

public class UserService {

    public static String changeUserAccountValue(User user, Double newValue){
        user.setAccountValue(newValue);
        return "User " + user.getIdentifier() + " new account value is: " + newValue;
    }
}
