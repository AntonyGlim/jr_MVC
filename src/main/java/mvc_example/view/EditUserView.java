package mvc_example.view;

import mvc_example.controller.Controller;
import mvc_example.model.ModelData;

public class EditUserView implements View {

    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser());
        System.out.println("===================================================");
    }

    public void fireEventUserDeleted(long id){
        controller.onUserDelete(id);
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
