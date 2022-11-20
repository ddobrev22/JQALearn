package Homework2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter 2nd number:");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.println("Average is: " + myMethod(num1,num2));


    }

    private static double myMethod(int num1, int num2) {

        return (num1 + num2) /2.0;
    }
}
