package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
}
