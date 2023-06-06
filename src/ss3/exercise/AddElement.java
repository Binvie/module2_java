package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 9, 11, 2};
        int[] arrNew;
        arrNew = new int[arr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you wanna add :");
        int number = sc.nextInt();

        System.out.println("Enter position you wanna add :");
        int index = sc.nextInt();

        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Cant add this number into position " + index);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (index > i) {
                    arrNew[i] = arr[i];
                } else if (index < i) {
                    arrNew[i] = arr[i - 1];
                } else if (index == i) {
                    arrNew[i] = number;
                }
            }
            System.out.println(Arrays.toString(arrNew));
        }
    }
}
