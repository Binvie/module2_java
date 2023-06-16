package ss11.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Stack<String> mStack = new Stack<>();
        String str = "123456";
        String[] array = str.split("");
//        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            wStack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            mStack.push(wStack.pop());
        }
        System.out.println(mStack);
    }
}
