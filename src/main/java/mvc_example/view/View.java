package mvc_example.view;

import mvc_example.controller.Controller;
import mvc_example.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
