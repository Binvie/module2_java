package ss13.exercise;

import ss13.practice.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAlgorithms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length : ");
        int number = Integer.parseInt(scanner.nextLine());

        int[] str = new int[number];
        for (int i = 0; i < number; i++) {
            str[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        System.out.println("Enter number that u wanna find: ");
        int value = Integer.parseInt(scanner.nextLine());
        binarySearch(str, 0, number - 1, value);
        System.out.println(binarySearch(str, 0, number - 1, value));
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (right >= left){
            if (array[mid] == value) return mid;

            else if (array[mid] < value) {
                left = mid + 1;
                return binarySearch(array, left, right, value);
            } else if (array[mid] > value) {
                right = mid - 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}
