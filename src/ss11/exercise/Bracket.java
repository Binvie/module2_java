package ss11.exercise;

import java.util.Arrays;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        int count = 0;
        int count1 = 0;
        String str = "s * (s – a) * (s – b) * (s – c)";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            if (n == '(') {
                stack.push(n);
                count++;
            } else if (n == ')') {
                stack.push(n);
                count1++;
            }
        }
        if (count == count1 && stack.get(0) == '(') {
            System.out.println("true");
        } else System.out.println("fasle");
    }
}
