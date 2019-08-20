package mvc_example.model;

import mvc_example.bean.User;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Он нам понадобится на начальном этапе.
 */
public class FakeModel implements Model {

    private ModelData modelData =new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(
            new LinkedList<>(
                Arrays.asList(
                    new User("Rick", 456797, 21),
                    new User("Dest", 984563, 27),
                    new User("Miln", 451235, 29),
                    new User("Fred", 124523, 34)
                )
            )
        );
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }
}
