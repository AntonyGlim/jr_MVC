package com.javarush.task.task36.task3608.controller;

import com.javarush.task.task36.task3608.model.Model;
import com.javarush.task.task36.task3608.view.UsersView;

/**
 * Этот класс будет получать запрос от клиента,
 * оповещать Модель об этом, а Модель, в свою очередь,
 * будет обновлять ModelData.
 */
public class Controller {

    private Model model;
    private UsersView usersView;

    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * который должен обратиться к модели
     * и инициировать загрузку пользователей
     */
    public void onShowAllUsers(){
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }
}
