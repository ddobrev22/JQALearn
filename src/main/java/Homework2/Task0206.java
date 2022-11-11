package Homework2;

public class Task0206 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean isSame = false;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                isSame = array1[i] == array2[i];
            }
        }
        if (isSame) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
