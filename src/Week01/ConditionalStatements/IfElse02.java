package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("please inter a integer:");
        int number = num.nextInt();
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        num.close();
    }

}
