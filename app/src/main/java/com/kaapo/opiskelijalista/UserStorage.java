package com.kaapo.opiskelijalista;

import java.util.ArrayList;

public class UserStorage {

    private static UserStorage storage = null;
    private ArrayList<User> userList;

    private UserStorage() {
        userList = new ArrayList<>();
    }

    public static UserStorage getInstance() {
        if (storage == null) {
            storage = new UserStorage();
        }
        return storage;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
