package ss11.exercise;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String arr = "able was i ere i saw elba";
        String str[] = arr.split("");
        System.out.println(Arrays.toString(str));
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);
            queue.add(str[i]);
        }
        boolean flag = true;
        while (!stack.isEmpty()) {
            if (Objects.equals(stack.pop(), queue.remove())) {
                flag = true;
            } else {
                flag = false;
                System.out.println("false");
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        }
    }
}
