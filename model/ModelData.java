package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.List;

/**
 * объект, который будет хранить необходимые данные для отображения на клиенте.
 */
public class ModelData {
    private List<User> users; //список пользователей для отображения.

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
