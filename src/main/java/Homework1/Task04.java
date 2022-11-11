package Homework1;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("working hours= ");
        int hours = Integer.parseInt(scan.nextLine());
        System.out.print("money amount= ");
        double money = Double.parseDouble(scan.nextLine());
        System.out.println("Is it weekend? true or false= ");
        boolean weekend = Boolean.parseBoolean(scan.nextLine());
        if (!weekend) {
            System.out.println("I will work");
        } else if (money > 0) {
            if (money < 10) {
                System.out.println("I will buy an ice cream ");
            } else {
                System.out.println("I will go to cinema");
            }
        } else {
            System.out.println("I will watch tv at home");
        }
    }
}
