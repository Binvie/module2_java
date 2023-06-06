package ss1.practice;

import java.util.Scanner;

public class body_masss {
    public static void main(String[] args) {
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter your weight :");
        float weight1 = weight.nextFloat();

        System.out.println("Enter your height :");
        Scanner height = new Scanner(System.in);
        float height1 = height.nextFloat();

        float bmi = weight1 / (height1 * height1);
        if (bmi < 18.5) {
            System.out.println("%f" + bmi + " Underweight");
        } else if (bmi < 25) {
            System.out.println(bmi + " normal");
        } else if (bmi < 30) {
            System.out.println(bmi + " overweight");
        } else {
            System.out.println(bmi + " Obese");
        }
    }

}
