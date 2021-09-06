package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int numberOfElement;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Elements: ");
        numberOfElement = scanner.nextInt();
        for (int i=0;i<numberOfElement;i++){
            System.out.print("Enter Element: ");
            number = scanner.nextInt();
            arrayList.add(number);
        }
        System.out.println("==========================");
        System.out.println(arrayList);
        System.out.println("==========================");
        System.out.println("After Clear.");
        arrayList.clear();
        System.out.println(arrayList);
    }
}
