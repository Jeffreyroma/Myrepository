package my.task.hw11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String userName;
        String password;
        UserRepository userRepository = new UserRepository();
        RegistrationAndAuthorizationService registrationAndAuthorizationService = new RegistrationAndAuthorizationService(userRepository);
        while (true) {
            printMainMenu();
            Scanner scanner = new Scanner(System.in);
            int numberOfChoices = scanner.nextInt();
            switch (numberOfChoices) {
                case 1 -> {
                    System.out.println("Enter username");
                    userName = inputText();
                    System.out.println("Enter password");
                    password = inputText();
                    registrationAndAuthorizationService.checkUserByUserNameAndPassword(userName, password);
                }
                case 2 -> {
                    System.out.println("Come up with a new username");
                    userName = inputText();
                    System.out.println("Come up with a new password");
                    password = inputText();
                    registrationAndAuthorizationService.saveUser(userName, password);
                }
                case 3 -> System.exit(0);
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("Welcome dear user!\n1.Authorization\n2.Registration\n3.Exit");
        System.out.println("Pleas enter a number to select the action you need:");
    }

    public static String inputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
