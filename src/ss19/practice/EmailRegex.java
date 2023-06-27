package ss19.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {

    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^\\w*@\\w+(\\.\\w+)$";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your's email");
            String s = scanner.nextLine();
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(s);
            if (matcher.matches()) {
                System.out.println("valid");
            }else System.out.println("invalid");
//        System.out.println(matcher.matches());
    }
}
