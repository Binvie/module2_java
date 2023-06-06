package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arrNum = {10, 5, 6, 9, 11, 2};
        int[] arrNew;
        arrNew = new int[arrNum.length];
        System.out.println("Input number that you wanna delete :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int index = 0;

        for (int i = 0; i < arrNum.length; i++) {
            if (number != arrNum[i]) {
                arrNew[index] = arrNum[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
