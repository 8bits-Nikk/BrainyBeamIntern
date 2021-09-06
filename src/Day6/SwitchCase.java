package Day6;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("======== Welcome ========");
            System.out.println("1. Login.");
            System.out.println("2. Register.");
            System.out.println("3. Logout.");
            System.out.println("4. Exit.");
            System.out.println("=========================");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("======== Login Page ========");
                    break;
                case 2:
                    System.out.println("======== Register Page ========");
                    break;
                case 3:
                    System.out.println("======== Logout Page ========");
                    break;
                case 4:
                    System.out.println("======== Thank You ========");
                    break;
                default:
                    System.out.println("Enter Valid Choice.");
            }
        }while (choice != 4);
    }
}
