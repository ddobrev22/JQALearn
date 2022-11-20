package Homework2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        
        forArrayRead(array);
        forArrayPrint(array);
        
        whileArrayRead(array);
        whileArrayPrint(array);
    }

    private static void whileArrayPrint(int[] array) {
        int index = 0;
        while (index< array.length){
            System.out.print(array[index]+ " ");
            index++;
        }
    }

    private static void whileArrayRead(int[] array) {
        Scanner scan = new Scanner(System.in);
        int index = 0;
        while (index< array.length){
            System.out.printf("Enter number %d: ",index+1);
            array[index] = Integer.parseInt(scan.nextLine());
            index++;
        }
    }

    public static void forArrayRead(int[] array){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter number %d: ",i+1);
            array[i] = Integer.parseInt(scan.nextLine());
        }
    }
    public static void forArrayPrint(int[] array){
        Scanner scan = new Scanner(System.in);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
