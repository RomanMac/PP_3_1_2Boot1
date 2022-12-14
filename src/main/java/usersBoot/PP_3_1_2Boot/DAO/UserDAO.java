package usersBoot.PP_3_1_2Boot.DAO;

import usersBoot.PP_3_1_2Boot.model.User;


import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void addUser(User user);
    void removeUserById(int id);
    void updateUser(User user, int id);
    User getUserById(int id);
}
