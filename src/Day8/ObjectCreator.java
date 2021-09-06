package Day8;

import java.util.Scanner;

public class ObjectCreator {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("======== Data Entry ========");
            System.out.println("1. Add data.");
            System.out.println("2. Exit.");
            System.out.println("============================");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addData();
                    break;
                case 2:
                    System.out.println("======== Thank You ========");
                    break;
                default:
                    System.out.println("Enter Valid choice.");
            }
        }while (choice !=2);
    }

    private static void addData() {
        int id;
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        try {
            Data obj = Data.getInstance(id,name);
            if(obj.getClass() != null){
                System.out.println("Data Added");
            }
        }catch (Exception e){
            System.out.println("Memory Full. No more data can be Added.");
        }
    }
}
