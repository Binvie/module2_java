package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array : ");
        int m = sc.nextInt();
        System.out.println("Enter length of element in array : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][];

        for (int i = 0; i < m; i++) {
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element arr[" + i + "][" + j + "]");
                int number = sc.nextInt();
                arr[i][j] = number;
            }
        }
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(min);
    }
}
