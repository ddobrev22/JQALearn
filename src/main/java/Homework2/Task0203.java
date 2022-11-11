package Homework2;

import java.util.Scanner;

public class Task0203 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] array = new double[5];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter number %d: ",i+1);
            array[i] = Integer.parseInt(scan.nextLine());
        }
//        for (int i = 0; i < 5; i++) {
 //           System.out.print(array[i]+" ");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }
}

