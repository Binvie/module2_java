package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheBiggestElement {
    public static void main(String[] args) {

        System.out.println("Enter number of element in the array : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter length of the array");
        int n = sc.nextInt();

        int[][] arr = new int[m][];

        for (int i = 0; i < m; i++) {
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(" The biggest element is : " + max);
    }
}
