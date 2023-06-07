package ss3.exercise;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
//        int[] arr1 = {10, 5, 6, 9, 11, 2};
//        int[] arr2 = {1, 2, 3, 4, 5, 6};
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
        System.out.println("Enter the column you wanna sum : ");
        int sum = 0;
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][number - 1];
        }
        System.out.println(sum);
    }
}
