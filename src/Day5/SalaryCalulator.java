package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaryCalulator {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("======== Welcome ========");
            System.out.println("1. Add Employee.");
            System.out.println("2. List Employee.");
            System.out.println("3. Calculate Salary of Employee.");
            System.out.println("4. Exit.");
            System.out.println("=========================");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    employees.add(addEmployee());
                    break;
                case 2:
                    listEmployees();
                    break;
                case 3:
                    calculateSalary();
                    break;
                case 4:
                    System.out.println("======== Thank You ========");
                    break;
                default:
                    System.out.println("Enter Valid Choice.");
            }
        }while (choice != 4);
    }

    private static void calculateSalary() {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of Employee: ");
        name = scanner.nextLine();
        for (int i=0;i<employees.size();i++){
            if(employees.get(i).getName().equals(name)){
                float salary = employees.get(i).getDailyWages() * employees.get(i).getNoOfDays();
                System.out.println("Employee Salary: "+salary);
                break;
            }
        }
    }

    private static void listEmployees() {
        for (int i=0;i<employees.size();i++){
            System.out.println("=========================");
            System.out.println(String.format("Employee Id: %d \nEmployee Name: %s \nNo. work Days: %d \nDaily Wages: %f",
                     employees.get(i).getId(),employees.get(i).getName(),
                       employees.get(i).getNoOfDays(),employees.get(i).getDailyWages()));
        }
    }

    private static Employee addEmployee() {
        Scanner scanner = new Scanner(System.in);
        int id,noOfDays;
        String name;
        float dailyWages;
        System.out.print("Id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("No of Work Days: ");
        noOfDays = scanner.nextInt();
        System.out.print("Daily Wages: ");
        dailyWages = scanner.nextFloat();
        Employee obj = new Employee(id,name,noOfDays,dailyWages);
        return obj;
    }
}
