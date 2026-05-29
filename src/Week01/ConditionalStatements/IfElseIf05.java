package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElseIf05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your age:");
        int ages = in.nextInt();
        System.out.printf("your age is :%d%n", ages);

        if (ages < 12) {
            System.out.println("Child ticket: $150");
        } else if (ages < 65) {
            System.out.println("Adult ticket: $250");
        } else {
            System.out.println("Silver-hair ticket: $180");
        }
        in.close();
    }
}
