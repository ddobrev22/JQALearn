package Homework2;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = {10, 12, 1, 8, 4};
        int[] array2 = new int [array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Homework8.First array: ");
        arrayPrint(array1);

        System.out.println("Copied array: ");
        arrayPrint(array2);
    }
    public static void arrayPrint (int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
