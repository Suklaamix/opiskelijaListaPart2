package com.kaapo.opiskelijalista;


import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserStorage {

    private static UserStorage storage = null;
    private ArrayList<User> userList;

    private UserStorage() {
        userList = new ArrayList<>();
    }

    public static UserStorage getInstance(Context context) {
        if (storage == null) {
            storage = new UserStorage();
            storage.loadUsers(context);
        }
        return storage;
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
    public void saveUsers(Context context) {
        ArrayList<User> users = getUsers();

        try {
            FileOutputStream file = context.openFileOutput("userlista.txt", Context.MODE_PRIVATE);
            ObjectOutputStream input = new ObjectOutputStream(file);
            input.writeObject(users);
            input.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadUsers(Context context) {
        try {
            FileInputStream file = context.openFileInput("userlista.txt");
            ObjectInputStream input = new ObjectInputStream(file);
            userList = (ArrayList<User>) input.readObject();
            input.close();
            file.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}