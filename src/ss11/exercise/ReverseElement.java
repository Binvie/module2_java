package ss11.exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);

        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack2.push(stack.pop());
            System.out.println(stack2);
        }
    }
}



