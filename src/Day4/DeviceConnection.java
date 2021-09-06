package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class DeviceConnection {

    static ArrayList<String> devices = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("======== Welcome ========");
            System.out.println("1. Add Device.");
            System.out.println("2. Connect Device.");
            System.out.println("3. Exit.");
            System.out.println("=========================");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addDevice();
                    break;
                case 2:
                    try {
                        connectDevice();
                    }catch (InvalidDevice invalidDevice) {
                        System.out.println("Error: "+invalidDevice.getMessage());
                    }finally {
                        System.out.println("Device Available for connect.");
                        System.out.println(devices);
                    }
                    break;
                case 3:
                    System.out.println("======== Thank You ========");
                    break;
                default:
                    System.out.println("Enter Valid Choice.");
                    break;
            }
        }while (choice != 3);
    }

    public static void addDevice(){
        Scanner scanner = new Scanner(System.in);
        String dname;
        System.out.println("Enter Device Name: ");
        dname = scanner.nextLine();
        devices.add(dname);
    }

    public static void connectDevice() throws InvalidDevice{
        Scanner scanner = new Scanner(System.in);
        String temp;
        System.out.println("Enter Name to connect: ");
        temp = scanner.nextLine();
        if(devices.contains(temp)){
            System.out.println("Connected Successfully.....");
        }else{
            throw new InvalidDevice("********* Device Not Found **********");
        }
    }
}
