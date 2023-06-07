package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        System.out.println("Enter number of element in the array : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.printf("Enter length of child array ");
        int n = sc.nextInt();

        int[][] arr = new int[m][];

        for (int i = 0; i < m; i++) {
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element arr[" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arr[i][i];
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);
    }
}
