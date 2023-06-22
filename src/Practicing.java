import java.util.Scanner;

public class Practicing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x :");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Input y :");
        int y = Integer.parseInt(scanner.nextLine());
        Practicing practicing = new Practicing();
        calculate(x, y);
    }

    public static void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x / y;
            int d = x * y;
            System.out.println("a + b = " + a);
            System.out.println("a - b = " + b);
            System.out.println("a / b = " + c);
            System.out.println("a * b = " + d);
        } catch (Exception e) {
            System.out.println("Exception appear " + e.getMessage());
        }
    }
}
