package Day6;

import java.util.ArrayList;
import java.util.Scanner;


public class MinMax {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Elements: ");
        number = scanner.nextInt();

        for (int i=0;i<number;i++){
            System.out.print("Enter "+(i+1)+"th Element: ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println(arrayList);
        findMin(arrayList);
        findMax(arrayList);
        findAvg(arrayList);
    }

    private static void findAvg(ArrayList<Integer> arrayList) {
        float avg = (arrayList.stream().mapToInt(Integer::intValue).sum())/(arrayList.size());
        System.out.println("Average of list is: "+avg);
    }

    private static void findMax(ArrayList<Integer> arrayList) {
        System.out.printf("Maximum Element is: %d%n", arrayList.stream().max(Integer::compareTo).get());
    }

    private static void findMin(ArrayList<Integer> arrayList) {
        System.out.printf("Minimum Element is: %d%n", arrayList.stream().min(Integer::compareTo).get());
    }
}
