package my.task.hw11;

public class User {

    private static String userName;

    private static String userPassword;

    public User(String userName, String userPassword) {
        User.userName = userName;
        User.userPassword = userPassword;
    }

    public static String getUserName() {
        return userName;
    }

    public static String getUserPassword() {
        return userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
