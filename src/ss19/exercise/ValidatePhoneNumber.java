package ss19.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your's phone number");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
    }
}
