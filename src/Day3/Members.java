package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Members extends Register {

    static ArrayList<User> users = new ArrayList<>();

    public void allusers(){
        for (User user : users) {
            System.out.println("=========================");
            System.out.printf("User Id: %d \nUser Name: %s \nUser Email: %s\nUser Password: %s%n",
                    user.getId(), user.getName(),
                    user.getEmail(), user.getPassword());
        }
    }

    public static void main(String[] args) {
        Members m = new Members();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("======== Welcome ========");
            System.out.println("1. For Register User");
            System.out.println("2. For List User");
            System.out.println("3. For Delete User");
            System.out.println("4. For Exit");
            System.out.println("=========================");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            if(choice == 1){
                int id;
                String name,email,password;
                System.out.print("Id: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                name = sc.nextLine();
                System.out.print("Email: ");
                email = sc.nextLine();
                System.out.print("Password: ");
                password = sc.nextLine();
                User obj = m.register(id,name,email,password);
                users.add(obj);
            }else if(choice == 2){
                m.allusers();
            }else if(choice == 3){
                String del_name;
                System.out.println("Enter name to delete: ");
                sc.nextLine();
                del_name = sc.nextLine();
                users = m.deleteuser(users,del_name);
            }else if (choice == 4){
                System.out.println("====== Thank You ======");
                break;
            }else {
                System.out.println("Enter Valid choice.");
            }
        }while (true);
    }
}
