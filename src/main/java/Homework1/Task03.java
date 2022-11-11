package Homework1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("num1=");
        double num1 = Double.parseDouble(scan.nextLine());
        System.out.print("num2= ");
        double num2 = Double.parseDouble(scan.nextLine());
        System.out.print("num3= ");
        double num3 = Double.parseDouble(scan.nextLine());
        double temp = num1;
        num1 = num2;
        System.out.println("new num1= "+num1);
        num2 = num3;
        System.out.println("new num2= "+num2);
        num3 = temp;
        System.out.println("new num3= "+num3);
        System.out.printf("(%f + %f) - %f = %f", num1, num2, num3,(num1+num2)-num3);
    }
}
