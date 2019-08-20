package mvc_example;

import mvc_example.controller.Controller;
import mvc_example.model.MainModel;
import mvc_example.model.Model;
import mvc_example.view.EditUserView;
import mvc_example.view.UsersView;

public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();

        EditUserView editUserView = new EditUserView();
        editUserView.setController(controller);
        controller.setEditUserView(editUserView);
        usersView.fireEventOpenUserEditForm(126);

        editUserView.fireEventUserDeleted(124L);

        usersView.fireEventShowDeletedUsers();
    }
}