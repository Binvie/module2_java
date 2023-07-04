package ss2.exercise;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter from 1 to 4" +
                "\n 1. Print the rectangle" +
                "\n 2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)" +
                "\n 3. Print isosceles triangle" +
                "\n 4. Exit ");
        int choice = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter height: ");
                    int height = sc.nextInt();
                    System.out.println("Enter width: ");
                    int width = sc.nextInt();
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < height; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                case 2:
                    System.out.println("Enter the length of the Triangle :");
                    int length = sc.nextInt();
                    for (int i = 0; i < length; i++) {
                        for (int j = length; j > i; j--) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    for (int i = 0; i <= length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (j >= i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 0; i <= length; i++) {
                        for (int j = 0; j < length; j++) {
                            if (i + j >= length) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter height :");
                    int height1 = sc.nextInt();
                    for (int i = 0; i <= height1; i++) {
                        for (int j = 0; j < height1; j++) {
                            if (j + i >= height1) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice !");
                    break;
            }
        } while (flag);
    }
}
