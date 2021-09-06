package Day3;

import java.util.Scanner;

public class MathDemo implements Sum,Multiplication {
    public static void main(String[] args) {
        int data1,data2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        data1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        data2 = scanner.nextInt();
        MathDemo mathDemo =new MathDemo();
        mathDemo.show(data1,data2);
    }
    public void show(int data1,int data2){
        Sum.super.doSum(data1,data2);
        Multiplication.super.doMultiplication(data1,data2);
    }
}
