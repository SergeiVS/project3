package homework.hwTask3.Repository;

import homework.hwTask3.Entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserList {
    private final Map<Integer, User> userMap;

    public UserList() {
        this.userMap = new HashMap<>();
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }
}
