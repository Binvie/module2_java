package ss8.pratice;

import java.util.Scanner;

public class BeautifulArray {
    public int[] arr;
    public boolean flag = false;
    public double sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length :");
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter element " + (i + 1));
            int num = sc.nextInt();
            arr[i] = num;
        }
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                sum1 += arr[j];
            }
            if (sum == sum1) {
                System.out.println("true");
                break;
            } else {
                sum = 0;
                sum1 = 0;
            }
        }
    }
}


// for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                int[] array = new int[i];
//                array[j] = arr[i - 1];
//                int[] array1 = new int[arr.length - i];
//                array1[j] = arr[i + 1];
////                if (array1.length > array.length) {
////                    }
//                System.out.println(array1);
//                System.out.println(array);
//            }
//        }



