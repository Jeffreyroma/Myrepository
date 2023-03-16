package my.task.hw11;

import java.util.Scanner;

public class MainWindow {

    public static void printSelectiveWindow() {
        System.out.println("Welcome dear user!\n1.Registration\n2.Authorization\n3.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter a number to select the action you need:");
        int numberOfChoices = scanner.nextInt();

        switch (numberOfChoices) {
            case 1:
                try {
                    registrationUser();
                } catch (WrongLoginException | WrongPasswordException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                try {
                    authorizationUser();
                } catch (UserNotExistException | WrongPasswordException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.exit(3);
                break;
        }

    }

    public static void registrationUser() throws WrongLoginException, WrongPasswordException {
        String regex1 = "\\w{5,20}";
        String regex2 = "\\w{8,}";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Come up with a new username");
        String textOfUsername = scanner.nextLine();
        if (textOfUsername.matches(regex1)) {
            System.out.println("Username is correct!");
        } else {
            throw new WrongLoginException("Username doesn't meet the requirements\n" +
                    "The login must contain only Latin letters, numbers and underscores. The length should be from 5 to 20 characters.");
        }
        System.out.println("Come up with a new password");
        String textOfUserPassword = scanner.nextLine();
        if (textOfUserPassword.matches(regex2)) {
            System.out.println("Password is correct!");


        } else {
            throw new WrongPasswordException("Password doesn't meet the requirements\n" +
                    "The password must contain only Latin letters, numbers and an underscore. Length from 8 characters.");
        }
        if (textOfUsername.matches(regex1) && textOfUserPassword.matches(regex2)) {
            System.out.println("Registration was successful!!");
            saveUser(textOfUsername, textOfUserPassword);
            printSelectiveWindow();
        }
    }

    public static void saveUser(String username, String password) {
        User user = new User(username, password);
        UserRepository userRepository = new UserRepository();
        userRepository.addUsers(user);
        userRepository.printUsers();
    }

    public static void authorizationUser() throws WrongPasswordException, UserNotExistException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        String textOfUsername = scanner.nextLine();
        if (User.getUserName().equals(textOfUsername)) {
            System.out.println("There is such a username!");
        } else {
            throw new UserNotExistException("User not found");
        }

        System.out.println("Enter your password");
        String textOfPassword = scanner.nextLine();
        if (User.getUserPassword().equals(textOfPassword)) {
            System.out.println("Password is correct!");
        } else {
            throw new WrongPasswordException("Password is not correct");
        }
        if (User.getUserName().equals(textOfUsername) && User.getUserPassword().equals(textOfPassword)) {
            System.out.println("Welcome to the system");
            printSelectiveWindow();
        }
    }
}
