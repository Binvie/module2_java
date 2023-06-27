package ss19.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_REGEX = "^[CAP]{1}\\d{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your class :");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }
}
