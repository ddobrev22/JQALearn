package Homework1;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        double num2 = Double.parseDouble(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        double num4 = Double.parseDouble(scan.nextLine());
        int inum2 = (int) num2;
        int inum4 = (int) num4;
        System.out.printf("Sum after first casting from int to double.sum1: %d%n",num1+inum2,num3+inum4);
        double dnum1 = num1;
        double dnum3 = num3;
        System.out.printf("Sum after second casting form double to int: %f%n",num2+dnum1,num4+dnum3);

    }
}
