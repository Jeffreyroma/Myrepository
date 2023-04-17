package my.task.hw16;

import java.time.LocalDateTime;

public class User {

    private final String userName;

    private final String userPassword;

    private final LocalDateTime registrationDate;

    private LocalDateTime lastAuthorizationDate;

    public User(String userName, String userPassword,LocalDateTime registrationDate, LocalDateTime lastAuthorizationDate) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.registrationDate = registrationDate;
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    public  String getUserName() {
        return userName;
    }

    public  String getUserPassword() {
        return userPassword;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setLastAuthorizationDate(LocalDateTime lastAuthorizationDate) {
        this.lastAuthorizationDate = lastAuthorizationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", registrationDate=" + registrationDate +
                ", lastAuthorizationDate=" + lastAuthorizationDate +
                '}';
    }
}
