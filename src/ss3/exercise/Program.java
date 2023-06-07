package ss3.exercise;

public class Program {
    public static void main(String[] args) {
        int h = 6;
        for (int i = 1; i < 2 * h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j == h - i || j == h + i) {
                    System.out.print(i);
                } else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 2 * h; i > 1; i--) {
            for (int j = 1; j < (2 * h) + 1; j++) {
                if (j == h - i || j == h + i) {
                    System.out.print(i);
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
