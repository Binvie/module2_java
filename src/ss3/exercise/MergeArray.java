package ss3.exercise;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 6, 9, 11, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] finalArr;
        finalArr = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            finalArr[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            finalArr[index] = arr2[i];
            index++;
        }
        System.out.println(Arrays.toString(finalArr));
        System.out.println(index);
    }
}
