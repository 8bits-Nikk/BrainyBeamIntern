package Day13_14;

import java.util.ArrayList;
import java.util.Scanner;

public class RegisterLogin extends Validation {

    public static ArrayList<User> registrationpage(){
        ArrayList<User> data = new ArrayList<>();
        System.out.println("\n=========== Registration Page ===========");
        System.out.print("For Bulk Registration Enter [2] otherwise Enter [1].: ");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        if(choice == 2){
            System.out.println("Bulk Registration.");
            System.out.print("Enter No of Registration.:");
            int number = scanner.nextInt();
            for (int i=0; i<number;i++){
                User obj = register();
                try {
                    if(obj.getClass() != null){
                        data.add(obj);
                    }
                }catch (Exception e){
                    System.out.println("Registration Fail.");
                }
            }
        }else{
            User obj = register();
            try {
                if(obj.getClass() != null){
                    data.add(obj);
                }
            }catch (Exception e){
                System.out.println("Registration Fail.");
            }
        }
        return data;
    }

    public static User register(){
        String name,email,password,cPassword;
        String moNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Email: ");
        email = scanner.nextLine();
        System.out.print("Enter Mobile Number: ");
        moNumber = scanner.nextLine();
        System.out.print("Enter Password: ");
        password = scanner.nextLine();
        System.out.print("Confirm Password: ");
        cPassword = scanner.nextLine();
        if(isValidName(name) && isValidEmail(email) && isValidMoNumber(moNumber) && isValidPassword(password,cPassword)){
            return new User(name,email,password,moNumber);
        }else{
            return null;
        }
    }

    public static void login(ArrayList<User> users){
        String email,password;
        boolean FLAG = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=========== Login Page ===========");
        System.out.print("Enter Email: ");
        email = scanner.nextLine();
        System.out.print("Enter Password: ");
        password = scanner.nextLine();
        if(isValidEmail(email) && isValidPassword(password)){
            for (User user : users){
                if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                    System.out.printf("Login Successful.\n##### Profile #####\nName: %s \nEmail: %s \nMobile Number: %s \n"
                                    ,user.getName(),user.getEmail(),user.getMoNumber());
                    FLAG = true;
                    break;
                }else{
                    FLAG = false;
                }
            }
            if(!FLAG){
                System.out.println("Login Fail..");
            }
        }
    }
}
