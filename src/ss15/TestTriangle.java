package ss15;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("input a (side of a triangle): ");
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("input b (side of a triangle): ");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.println("input c (side of a triangle): ");
            int z = Integer.parseInt(scanner.nextLine());
            test1(x, y, z);
        } catch (NumberFormatException e) {
            System.out.println("Not available");
        } catch (NegativeNumberException e) {
            System.out.println("Not available");
        }
    }

    public static void test1(int x, int y, int z) throws NegativeNumberException {
        if (x <= 0 || y <= 0 || z <= 0 || x + y <= z || x + z <= y || y + z <= x) {
            throw new NegativeNumberException();
        } else
            System.out.println("a , b ,c are sides of a triangle");
    }
}
