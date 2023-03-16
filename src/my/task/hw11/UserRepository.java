package my.task.hw11;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public  void addUsers(User user) {
        users.add(new User(User.getUserName(),User.getUserPassword()));
    }

    public void printUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
