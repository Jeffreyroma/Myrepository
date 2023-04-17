package my.task.hw16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        String userName;
        String password;
        LocalDateTime dateStart;
        LocalDateTime dateEnd;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
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
                    LocalDateTime localDateTime = LocalDateTime.now();

                    registrationAndAuthorizationService.saveUser(userName, password, localDateTime, localDateTime);
                }
                case 3 -> System.exit(0);
                case 4-> {
                    System.out.println("Pleas enter the period for which you want to view users\nyyyy-MM-dd ");
                    System.out.println("Start period");
                    dateStart = LocalDate.parse(inputText(),formatter).atStartOfDay();
                    System.out.println("End period");
                    dateEnd = LocalDate.parse(inputText(),formatter).atStartOfDay();
                    List<User> users = registrationAndAuthorizationService.findUsers(dateStart, dateEnd);
                    System.out.println(users);

                }
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("Welcome dear user!\n1.Authorization\n2.Registration\n3.Exit\n4.Find Users for time period");
        System.out.println("Pleas enter a number to select the action you need:");
    }

    public static String inputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
