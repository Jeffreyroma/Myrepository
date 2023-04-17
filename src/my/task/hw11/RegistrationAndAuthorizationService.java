package my.task.hw11;
import java.util.regex.Pattern;

public class RegistrationAndAuthorizationService {

    private final UserRepository userRepository;

    public RegistrationAndAuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void checkUserName(String userName) throws WrongLoginException {
        String regex1 = "\\w{5,20}";
        boolean meaningUserName = Pattern.matches(regex1, userName);
        if (!meaningUserName) {
            throw new WrongLoginException("Username doesn't meet the requirements\n" +
                    "The login must contain only Latin letters, numbers and underscores. The length should be from 5 to 20 characters.");
        } else {
            System.out.println("Username is correct!");
        }
    }

    public void checkPassword(String password) throws WrongPasswordException {
        String regex2 = "\\w{8,}";
        boolean meaningPassword = Pattern.matches(regex2,password);
        if (!meaningPassword) {
            throw new WrongPasswordException("Password doesn't meet the requirements\n" +
                    "The password must contain only Latin letters, numbers and an underscore. Length from 8 characters.");
        } else {
            System.out.println("Password is correct!");
        }
    }

    public void checkUserInSystem(String userName) throws UserNotExistException {
        if (userRepository.checkingByLogin(userName)) {
            throw new UserNotExistException("User with login "+ userName + " not found");
        }
    }

    public void checkUserByUserNameAndPassword(String userName, String password) throws WrongPasswordException {
        if (!(userRepository.checkingByLoginAndPassword(userName,password))) {
            throw new WrongPasswordException("User not found");
        } else {
            System.out.println("Welcome to the system");
        }
    }

    public void saveUser(String userName, String password) throws WrongLoginException, UserNotExistException, WrongPasswordException {
        checkUserName(userName);
        checkUserInSystem(userName);
        checkPassword(password);
        User user = new User(userName,password);
        userRepository.addUsers(user);
    }
}
