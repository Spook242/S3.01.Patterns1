package Nivel1Singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Undo history = Undo.getInstance();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            showMenu();
            int option = readOption(scanner);

            switch (option) {
                case 1:
                    System.out.print("Enter the new command: ");
                    String command = scanner.nextLine();
                    history.addCommand(command);
                    break;
                case 2:
                    history.removeLastCommand();
                    break;
                case 3:
                    history.listCommands();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a number from 0 to 3.");
            }
            System.out.println();
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("===== COMMAND MANAGER =====");
        System.out.println("1. Add command");
        System.out.println("2. Remove last command (Undo)");
        System.out.println("3. List commands (History)");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    private static int readOption(Scanner scanner) {
        int option = -1;
        try {
            option = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {

        }
        return option;
    }
}

