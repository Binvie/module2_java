package ss14;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("Enter list size: ");
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Ener " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        insertionSort(list);
    }
}


