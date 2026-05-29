package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElseIf04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your height:");
        double h = in.nextDouble();
        System.out.println("please enter your weight:");
        double w = in.nextDouble();

        double bmi = w / Math.pow(h / 100, 2);
        System.out.printf("Your bmi is:%f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi < 24) {
            System.out.println("You are normal weight");
        } else if (bmi < 27) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }

        in.close();
    }
}
