package homework.hwTask3.repository;

import homework.hwTask3.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserMap {
    private final Map<Integer, User> userMap;

    public UserMap() {
        this.userMap = new HashMap<>();
    }

    public Map<Integer, User> getUserMap() {
        return userMap;
    }
}
