package ss8.pratice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you wanna check :");
        int number = sc.nextInt();
        System.out.println(fizzBuzz(number));

    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isBuzz && isFizz){
            return "FizzBuzz";
        }
        if (isBuzz){
            return "Buzz";
        }
        if (isFizz) {
            return "Fizz";
        }
        return number + "";
    }
}
