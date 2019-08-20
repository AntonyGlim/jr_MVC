package mvc_example.model;

public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId);
    public void deleteUserById(long id);
}
