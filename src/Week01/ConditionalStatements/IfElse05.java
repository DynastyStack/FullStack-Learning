package Week01.ConditionalStatements;

import java.util.Scanner;

public class IfElse05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("please enter your purchase amount:");
        int amount = in.nextInt();
        System.out.println("are you member(T/F)?:");
        boolean member = in.nextBoolean();

        if (member) {
            System.out.printf("amount after discount is %f", amount * 0.9);
        } else {
            System.out.printf("price is %d", amount);
        }
        in.close();

    }
}
