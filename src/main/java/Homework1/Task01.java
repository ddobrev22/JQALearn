package Homework1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = Double.parseDouble(scan.nextLine());
        isInt(num1);
        double num2 = Double.parseDouble(scan.nextLine());
        isInt(num2);
        double num3 = Double.parseDouble(scan.nextLine());
        isInt(num3);

        if(num1 < num2){
            if (num1 < num3 && num3 < num2){
                System.out.println(num3 +" is between"+num1+" and "+ num2);
            }
        } else {
            if (num2 < num3 && num3 < num1){
                System.out.println(num3 +" is between"+num2+" and "+ num1);
            }
        }


    }
    public static void isInt(double number){
      //  boolean isInt = false;
//        if (scan.hasNextFloat()) {
//            float number = scan.nextFloat();
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        String formattedNum = decimalFormat.format(number);
            if (number == (int) number) {
                System.out.printf("%s the number is integer%n",formattedNum);
            } else {
                System.out.printf("%s the number is double%n",formattedNum);
        }
    }
}




//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please enter your first number: ");
//        BigDecimal num1 = new BigDecimal(scan.nextLine());
//        System.out.print("Please enter your second number: ");
//        BigDecimal num2 = new BigDecimal(scan.nextLine());
//        System.out.print("Please enter your third number: ");
//        BigDecimal num3 = new BigDecimal(scan.nextLine());
//
//        if (num1.compareTo(num2) < 0) {
//            if (num3.compareTo(num2) < 0 && num3.compareTo(num1) > 0) {
//                System.out.println(num3 + " is between " + num1 + " and " + num2);
//            }
//        } else {
//            if (num3.compareTo(num1) < 0 && num3.compareTo(num2) > 0) {
//                System.out.println(num3 + " is between " + num2 + " and " + num1);
//            }
//        }
//    }

