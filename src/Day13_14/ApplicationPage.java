package Day13_14;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationPage extends RegisterLogin{

    public static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("========== Welcome To Portal ============");
            System.out.println("1.] Press 1 for Registration.");
            System.out.println("2.] Press 2 for Login.");
            System.out.println("3.] Press 3 for Exit.");
            System.out.println("=========================================");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    users.addAll(registrationpage());
                    break;
                case 2:
                    login(users);
                    break;
                case 3:
                    System.out.println("=============== Thank You ===============");
                    break;
                default:
                    System.out.println("Enter Valid Choice...");
                    break;
            }
        }while (choice != 3);
    }
}
