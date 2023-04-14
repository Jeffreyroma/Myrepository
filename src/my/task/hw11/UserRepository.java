package my.task.hw11;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public final List<User> users = new ArrayList<>();

    public  void addUsers(User user) {
        users.add(user);
    }

    public boolean checkingByLogin(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkingByLoginAndPassword(String userName,String password) {
        for (User user : users)  {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
