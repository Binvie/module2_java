package ss11.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = Integer.parseInt(sc.nextLine());
        while (num != 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            stack1.push(stack.pop());
        }
        System.out.println(stack1);
    }
}
